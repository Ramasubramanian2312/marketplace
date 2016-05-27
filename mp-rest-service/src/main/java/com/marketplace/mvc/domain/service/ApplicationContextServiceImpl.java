package com.marketplace.mvc.domain.service;

import com.google.common.collect.Collections2;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Queues;
import com.marketplace.mvc.domain.request.ItemInfo;
import com.sun.tools.javac.jvm.Items;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by amysoresomasheka on 4/24/16.
 */

@Component("applicationContextService")
public class ApplicationContextServiceImpl {

    private EvictingQueue<ItemInfo> latestItemsQueue = EvictingQueue.create(3);
    private Queue<ItemInfo> latestItemsConcurrentQueue = Queues.synchronizedQueue(latestItemsQueue);


    public void  addlatestItemsToQueue(ItemInfo item){
        latestItemsConcurrentQueue.add(item);
    }

    public List<ItemInfo> getLatestItems(){
        List<ItemInfo> latestItemsConcurrentList = new ArrayList<ItemInfo>(latestItemsConcurrentQueue);
        Collections.reverse(latestItemsConcurrentList);
        return latestItemsConcurrentList;
    }
}
