package com.marketplace.mvc.database.dao;

import com.marketplace.mvc.database.model.LocationDto;

/**
 * Created by rchandrasekar on 4/27/2016.
 */
public interface LocationDao {
    void save(LocationDto location);
    LocationDto getByPrimaryKey(int id);
}
