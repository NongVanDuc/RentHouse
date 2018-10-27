package com.vanduc.renthouse.model;

public class Customer {
    private String image;
    private String address;
    private String addressDetail;
    private String nameCustomer;
    private String Contact;

    public Customer() {
    }

    public Customer(String image, String address, String addressDetail, String nameCustomer, String contact) {
        this.image = image;
        this.address = address;
        this.addressDetail = addressDetail;
        this.nameCustomer = nameCustomer;
        Contact = contact;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
