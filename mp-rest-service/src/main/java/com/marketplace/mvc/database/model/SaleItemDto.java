package com.marketplace.mvc.database.model;

import javax.persistence.*;

/**
 * Created by rchandrasekar on 4/20/2016.
 */
@Entity
@Table(name = "SALE_ITEM")
public class SaleItemDto {
    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private SaleItemType type;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private CustomerDto customerDto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SaleItemType getType() {
        return type;
    }

    public void setType(SaleItemType type) {
        this.type = type;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    @Override
    public String toString() {
        return "SaleItemDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
