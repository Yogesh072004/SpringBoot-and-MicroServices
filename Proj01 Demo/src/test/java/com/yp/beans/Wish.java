package com.yp.beans;

import java.util.Date; // instead of java.sql.Date

public class Wish {
    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public String generateMsg(String user) {
        int hour = date.getHours();  // Warning: deprecated, but used for simplicity
        if (hour < 12) {
            return "Good Morning::" + user;
        } else if (hour < 16) {
            return "Good Afternoon::" + user;
        } else if (hour < 20) {
            return "Good Evening::" + user;
        } else {
            return "GoodNight::" + user;
        }
    }
}