package com.coffeeshop.api.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CoffeeMug {
    @Id
    private ObjectId _id;

    private String size;
    private long height;
    private long  width;
    //Image

    public CoffeeMug() {
    }

    public CoffeeMug(ObjectId _id, String size, long height, long width) {
        this._id = _id;
        this.size = size;
        this.height = height;
        this.width = width;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "CoffeeMug{" +
                "_id=" + _id +
                ", size='" + size + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
