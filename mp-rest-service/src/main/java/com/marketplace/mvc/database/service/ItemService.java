package com.marketplace.mvc.database.service;

import com.marketplace.mvc.database.dao.LocationDao;
import org.springframework.stereotype.Service;

/**
 * Created by rchandrasekar on 4/27/2016.
 */
public interface ItemService {
    boolean addItem(String username, String itemName, String itemType, double price);
}
