package com.coffeeshop.api.domain;

import java.util.Date;

public class review {

    private int rank;
    private String comment;
    private Date  date;

    public review() {
    }

    public review(int rank, String comment, Date date) {
        this.rank = rank;
        this.comment = comment;
        this.date = date;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "review{" +
                "rank=" + rank +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
