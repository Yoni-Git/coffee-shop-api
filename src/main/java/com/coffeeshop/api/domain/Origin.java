package com.coffeeshop.api.domain;

public class Origin {
    private String continent;
    private String country;
    private String state;
    private String city;
    private String zip;
    private String areaName;

    public Origin() {

    }

    public Origin(String continent, String country, String state, String city, String zip, String areaName) {
        this.continent = continent;
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.areaName = areaName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}
