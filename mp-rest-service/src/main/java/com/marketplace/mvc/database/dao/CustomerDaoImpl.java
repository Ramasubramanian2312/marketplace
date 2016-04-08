package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.model.CustomerDto;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
@Service("customerDao")
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(CustomerDto c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(c);
    }

    @SuppressWarnings("unchecked")
    public List<CustomerDto> list() {
        Session session = this.sessionFactory.getCurrentSession();
        List<CustomerDto> customerDtoList = session.createQuery("from CustomerDto").list();
        return customerDtoList;
    }

    @SuppressWarnings("unchecked")
    public boolean isExistsUsername(String username) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CustomerDto where username = ?");
        List<CustomerDto> customerDtoList = query.setString(0, username).list();

        if(customerDtoList.size()>0)    return true;
        return false;
    }

    public boolean isExistsEmail(String email) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CustomerDto where emailId = ?");
        List<CustomerDto> customerDtoList = query.setString(0, email).list();

        if(customerDtoList.size()>0)    return true;
        return false;
    }
}
