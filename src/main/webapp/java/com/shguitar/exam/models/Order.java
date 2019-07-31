package com.shguitar.exam.models;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Order {
    private int id;

    private String purcaser;

    private Calendar orderDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPurcaser() {
        return purcaser;
    }

    public void setPurcaser(String purcaser) {
        this.purcaser = purcaser;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }
}
