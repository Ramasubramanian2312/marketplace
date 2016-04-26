package com.marketplace.mvc.database.service;

import com.marketplace.mvc.database.dao.CustomerCredentialsDao;
import com.marketplace.mvc.database.dao.CustomerCredentialsDaoImpl;
import com.marketplace.mvc.database.dao.CustomerDao;
import com.marketplace.mvc.database.dao.CustomerDaoImpl;
import com.marketplace.mvc.database.model.CustomerCredentialsDto;
import com.marketplace.mvc.database.model.CustomerDto;
import com.marketplace.mvc.database.model.SaleItemDto;
import com.marketplace.mvc.database.model.SaleItemType;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private CustomerCredentialsDao customerCredentialsDao;

    @Transactional(value="transactionManager", propagation = Propagation.REQUIRES_NEW)
    public void registerCustomer(String userName, String firstName, String lastName, String email) {
        AtomicReference<CustomerDto> customerDto = new AtomicReference<CustomerDto>(new CustomerDto(userName, firstName, lastName, email));
        customerDao.save(customerDto.get());
    }

    @Transactional(readOnly = true)
    public boolean isExistsEmail(String email) {
        return customerDao.isExistsEmail(email);
    }

    @Transactional(value="transactionManager", propagation = Propagation.REQUIRES_NEW)
    public boolean isExistsUsername(String username) {
        return customerDao.isExistsUsername(username);
    }

    @Transactional(value="transactionManager", propagation = Propagation.REQUIRES_NEW)
    public boolean isValidCredentials(String username, String password) {
        if(isExistsUsername(username)){
            return customerDao.isValidUser(username, password);
        }
        return false;
    }

    @Transactional(value="transactionManager", propagation = Propagation.REQUIRES_NEW)
    public boolean addOrUpdatePassword(String username, String password) {
        if(isExistsUsername(username)) {
            System.out.println("In ---> Working");
            CustomerDto customerDto = customerDao.getCustomerByUsername(username);
            CustomerCredentialsDto customerCredentialsDto = customerCredentialsDao.getByPrimaryKey(customerDto.getId());
            customerCredentialsDto.setPassword(password);
            customerDto.setCustomerCredentialsDto(customerCredentialsDto);
            customerCredentialsDto.setCustomerDto(customerDto);
            customerDao.update(customerDto);
            return true;
        }
        return false;
    }

    @Transactional(value="transactionManager", propagation = Propagation.REQUIRES_NEW)
    public void addItem(String username, String itemName, String type) {
        if(isExistsUsername(username)) {
            CustomerDto customerDto = customerDao.getCustomerByUsername(username);
            SaleItemDto saleItemDto = new SaleItemDto();
            saleItemDto.setName(itemName);
            saleItemDto.setType(SaleItemType.valueOf(type));
            Hibernate.initialize(customerDto.getSaleItemDtoList());
            saleItemDto.setCustomerDto(customerDto);
            customerDao.update(customerDto);
        }
    }
}
