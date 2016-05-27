package com.marketplace.mvc.database.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "price")
    private float price;

    @Column(name = "date_created", nullable = false)
    @CreationTimestamp
    private Date created;

    @Column(name = "date_modified", nullable = false)
    @UpdateTimestamp
    private Date modified;

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

    public Date getCreated() { return created; }

    public void setCreated(Date created) { this.created = created; }

    public Date getModified() { return modified; }

    public void setModified(Date modified) { this.modified = modified; }

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
