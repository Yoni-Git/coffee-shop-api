package com.coffeeshop.api.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Account {
    @Id
    private ObjectId _id;
    private String userName;

    public Account() {
    }

    public Account(ObjectId _id, String userName) {
        this._id = _id;
        this.userName = userName;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + _id + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
