package com.marketplace.mvc.domain.service;

import com.marketplace.mvc.domain.request.ItemInfo;
import com.marketplace.mvc.domain.request.ItemsList;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by amysoresomasheka on 4/24/16.
 */
public interface ItemManagementService {

    public void postLatestItems(ItemInfo itemInfo);

    public ItemsList getLatestItems();

}
