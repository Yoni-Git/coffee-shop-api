package com.coffeeshop.api.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beans")
public class Bean {

    @Id
    private ObjectId _id;
    private Origin origin;
    private String name;
    private int  qualityRanking;
    private String description;
    private long  altitude;
    private CoffeeType type;
    private String  Size;
    private int caffeineLevel;

    // Image

    public Bean() {
    }

    public Bean(ObjectId _id, Origin origin, String name, int qualityRanking, String description, long altitude, CoffeeType type, String size, int caffeineLevel) {
        this._id = _id;
        this.origin = origin;
        this.name = name;
        this.qualityRanking = qualityRanking;
        this.description = description;
        this.altitude = altitude;
        this.type = type;
        Size = size;
        this.caffeineLevel = caffeineLevel;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQualityRanking() {
        return qualityRanking;
    }

    public void setQualityRanking(int qualityRanking) {
        this.qualityRanking = qualityRanking;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getAltitude() {
        return altitude;
    }

    public void setAltitude(long altitude) {
        this.altitude = altitude;
    }

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }
}



