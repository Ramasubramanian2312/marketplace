package com.marketplace.mvc.rest.controller.itemscontroller;

import com.marketplace.mvc.domain.request.ItemInfo;
import com.marketplace.mvc.domain.request.ItemsList;
import com.marketplace.mvc.domain.response.MessageContent;
import com.marketplace.mvc.domain.service.ApplicationContextServiceImpl;
import com.marketplace.mvc.domain.service.ItemManagementService;
import com.marketplace.mvc.rest.RequestMappingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by amysoresomasheka on 4/24/16.
 */
@Controller
@RequestMapping("/")
public class PostItemsController {

    @Autowired
    private ItemManagementService itemManagementService;

    @RequestMapping(value = RequestMappingConstants.POST_ITEMS, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    MessageContent retrieveLatestItems(@RequestBody ItemInfo itemInfo){
        itemManagementService.postLatestItems(itemInfo);
        return new MessageContent("Item posted successfully");
    }
}