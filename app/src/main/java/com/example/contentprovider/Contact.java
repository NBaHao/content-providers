package com.example.contentprovider;

public class Contact {
    private String ten;
    private String sdt;

    public Contact(String ten, String sdt) {
        this.ten = ten;
        this.sdt = sdt;
    }
    public String getName() {
        return ten;
    }

    public String getPhoneNumber() {
        return sdt;
    }
}
