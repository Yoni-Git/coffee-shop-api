package com.coffeeshop.api.domain;

public class Milk {

    private String fatPercentage;
    private String type;
    private String size;

    public Milk() {
    }

    public Milk(String fatPercentage, String type, String size) {
        this.fatPercentage = fatPercentage;
        this.type = type;
        this.size = size;
    }

    public String getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(String fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "fatPercentage='" + fatPercentage + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
