package com.company.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private String customer_name;
    private Integer contact;
    private String shipping_address;
    private Integer grand_total;
    private LocalDateTime date_time;
    private List<Item> items;

    public Order(String customer_name, Integer contact, String shipping_address, Integer grand_total, LocalDateTime date_time, List<Item> items) {
        this.customer_name = customer_name;
        this.contact = contact;
        this.shipping_address = shipping_address;
        this.grand_total = grand_total;
        this.date_time = date_time;
        this.items = items;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public Integer getGrand_total() {
        return grand_total;
    }

    public void setGrand_total(Integer grand_total) {
        this.grand_total = grand_total;
    }

    public LocalDateTime getDate_time() {
        return date_time;
    }

    public void setDate_time(LocalDateTime date_time) {
        this.date_time = date_time;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
