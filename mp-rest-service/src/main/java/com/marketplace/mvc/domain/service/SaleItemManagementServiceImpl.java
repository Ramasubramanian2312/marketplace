package com.marketplace.mvc.domain.service;

import com.marketplace.mvc.domain.request.ItemInfo;
import com.marketplace.mvc.domain.request.ItemsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by amysoresomasheka on 4/24/16.
 */
@Component
public class SaleItemManagementServiceImpl implements ItemManagementService {

    @Autowired
    private ApplicationContextServiceImpl applicationContextService;

    public void postLatestItems(ItemInfo itemInfo){
        applicationContextService.addlatestItemsToQueue(itemInfo);
    }

    public ItemsList getLatestItems(){
        ItemsList itemsList = new ItemsList();
        itemsList.setItemInfoList(applicationContextService.getLatestItems());
        return itemsList;
    }
}
