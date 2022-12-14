package com.sds.model;

public class RequestCounter {
    private int count;

    public RequestCounter() {
        this.count = 0;
    }

    synchronized public void inc(int num) {
        count += num;
    }

    public int getVal() {
        return this.count;
    }
}
