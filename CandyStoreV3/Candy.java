package com.example.candystorev3;

public class Candy {

    private int id;
    private String name;
    private double price;

    public Candy(int newId, String newName, double newPrice) {
        setID(newId);
        setName(newName);
        setPrice(newPrice);
    }

    private void setID(int newId) {
        id = newId;
    }


    private void setName(String newName) {
        name = newName;
    }

    private void setPrice(double newPrice) {
        if(newPrice>=0.0)
        price = newPrice;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return id + "; " + name + "; " + price;
    }

}
