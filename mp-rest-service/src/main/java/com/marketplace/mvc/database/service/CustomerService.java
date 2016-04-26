package com.marketplace.mvc.database.service;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
public interface CustomerService {
    void registerCustomer(String userName, String firstName, String lastName, String email);
    boolean isExistsEmail(String email);
    boolean isExistsUsername(String username);
    boolean isValidCredentials(String username, String password);
    boolean addOrUpdatePassword(String username, String password);
    void addItem(String username, String itemName, String type);
}
