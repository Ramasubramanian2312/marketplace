package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.model.CustomerCredentialsDto;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rchandrasekar on 4/26/2016.
 */
@Service("customerCredentialsDao")
public class CustomerCredentialsDaoImpl implements CustomerCredentialsDao{

    @Autowired
    private SessionFactory sessionFactory;

    public CustomerCredentialsDto getByPrimaryKey(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return (CustomerCredentialsDto) session.get(CustomerCredentialsDto.class, id);
    }
}
