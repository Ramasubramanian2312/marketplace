package com.marketplace.mvc.domain.request;

import java.util.*;
/**
 * Created by amysoresomasheka on 4/24/16.
 */


public class ItemsList {

    private List<ItemInfo> itemInfoList;

    public ItemsList(){
        itemInfoList = new ArrayList<ItemInfo>();
    }

    public List<ItemInfo> getItemInfoList() {
        return itemInfoList;
    }

    public void setItemInfoList(List<ItemInfo> itemInfoList) {
        this.itemInfoList = itemInfoList;
    }




}
