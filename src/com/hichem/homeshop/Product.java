package com.hichem.homeshop;

public class Product {
    private String name;
    private String description;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }



    /**
     * Display a full description of the product
     */
    public void look(){

    }

    /**
     * Add the product to the bill
     * @param bill The consumer bill
     * @param quantity The quantity to add
     */

    public void buy(Bill bill, Integer quantity ){

    }
}
