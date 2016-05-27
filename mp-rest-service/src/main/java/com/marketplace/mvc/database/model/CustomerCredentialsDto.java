package com.marketplace.mvc.database.model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rchandrasekar on 4/9/2016.
 */
@Entity
@Table(name = "CUSTOMER_CREDENTIALS")
public class CustomerCredentialsDto {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "customerDto"))
    private int id;

    @Column(name = "password")
    private String password;

    @OneToOne
    @PrimaryKeyJoinColumn
    private CustomerDto customerDto;

    public CustomerCredentialsDto() {}

    public CustomerCredentialsDto(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    @Override
    public String toString() {
        return "CustomerCredentialsDto{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
