package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.model.CustomerDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(c);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    public List<CustomerDto> list() {
        Session session = this.sessionFactory.openSession();
        List<CustomerDto> customerDtoList = session.createQuery("from Customer").list();
        session.close();
        return customerDtoList;
    }
}
