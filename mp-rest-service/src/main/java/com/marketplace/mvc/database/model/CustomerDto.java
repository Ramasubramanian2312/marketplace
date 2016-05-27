package com.marketplace.mvc.database.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rchandrasekar on 4/5/2016.
 */
@Entity
@Table(name = "CUSTOMER_INFO")
public class CustomerDto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "emailid")
    private String emailId;

    @OneToOne(mappedBy = "customerDto", cascade = CascadeType.ALL)
    private CustomerCredentialsDto customerCredentialsDto;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customerDto", cascade = CascadeType.ALL)
    private List<SaleItemDto> saleItemDtoList = new ArrayList<SaleItemDto>();

    public CustomerDto() {}

    public CustomerDto(String username, String firstName, String lastName, String emailId) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public CustomerCredentialsDto getCustomerCredentialsDto() {
        return customerCredentialsDto;
    }

    public void setCustomerCredentialsDto(CustomerCredentialsDto customerCredentialsDto) {
        this.customerCredentialsDto = customerCredentialsDto;
    }

    public List<SaleItemDto> getSaleItemDtoList() {
        return saleItemDtoList;
    }

    public void setSaleItemDtoList(List<SaleItemDto> saleItemDtoList) {
        this.saleItemDtoList = saleItemDtoList;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", customerCredentialsDto=" + customerCredentialsDto +
                '}';
    }
}
