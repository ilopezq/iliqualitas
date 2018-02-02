package com.qualitas.mbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Car {
  
    
    private String id;
    private String brand;
    private int year;
    private String color;
    private String price;
    private double soldState;

    Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public String getId() {
        return id;
    }

   
    public void setId(String id) {
        this.id = id;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the soldState
     */
    public double getSoldState() {
        return soldState;
    }

    /**
     * @param soldState the soldState to set
     */
    public void setSoldState(double soldState) {
        this.soldState = soldState;
    }
    
    
}
    






