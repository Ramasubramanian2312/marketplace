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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by amysoresomasheka on 4/24/16.
 */
@Controller
@RequestMapping("/")
public class RetrieveItemsController {

    @Autowired
    private ItemManagementService saleItemManagementService;

    @RequestMapping(value = RequestMappingConstants.RETRIEVE_LATEST_ITEMS, method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ItemsList retrieveLatestItems(){

        return saleItemManagementService.getLatestItems();

    }
}
