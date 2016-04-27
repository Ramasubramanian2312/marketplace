package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.model.LocationDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rchandrasekar on 4/27/2016.
 */
@Service("locationDao")
public class LocationDaoImpl implements LocationDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(LocationDto location) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(location);
    }

    public LocationDto getByPrimaryKey(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return (LocationDto) session.get(LocationDto.class, id);
    }
}
