package com.company.entities;

public class Item {

    private Integer cost;
    private Integer shippingFee;
    private Integer taxAmount;
    private Product product;

    public Item(Integer cost, Integer shippingFee, Integer taxAmount, Product product) {
        this.cost = cost;
        this.shippingFee = shippingFee;
        this.taxAmount = taxAmount;
        this.product = product;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Integer shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Integer getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
