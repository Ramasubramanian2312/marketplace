package com.marketplace.mvc.database.service;

import com.marketplace.mvc.database.dao.CustomerDao;
import com.marketplace.mvc.database.dao.LocationDao;
import com.marketplace.mvc.database.model.CustomerDto;
import com.marketplace.mvc.database.model.SaleItemDto;
import com.marketplace.mvc.database.model.SaleItemType;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by rchandrasekar on 4/27/2016.
 */
@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private LocationDao locationDao;

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW)
    public boolean addItem(String username, String itemName, String itemType, double price) {
        if(customerDao.isExistsUsername(username)) {
            System.out.println("Attempt adding item for " + username);
            CustomerDto customerDto = customerDao.getCustomerByUsername(username);
            SaleItemDto saleItemDto = new SaleItemDto();
            saleItemDto.setName(itemName);
            saleItemDto.setType(SaleItemType.valueOf(itemType));
            saleItemDto.setCreated(new Date());
            saleItemDto.setModified(new Date());
            List<SaleItemDto> saleItemDtoList = customerDto.getSaleItemDtoList();
            saleItemDtoList.add(saleItemDto);
            saleItemDto.setCustomerDto(customerDto);
            customerDao.save(customerDto);
            System.out.println("Item added successfully for " + username);
            return true;
        }
        return false;
    }
}
