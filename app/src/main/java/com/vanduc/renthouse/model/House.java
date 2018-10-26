package com.vanduc.renthouse.model;

public class House {

    String id, name, phone;
    String image1, image2, image3;
    String address, description, price;
    String bed, bath, floor;

    public House(String id, String name, String phone, String image1, String image2, String image3, String address, String description, String price, String bed, String bath, String floor) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.address = address;
        this.description = description;
        this.price = price;
        this.bed = bed;
        this.bath = bath;
        this.floor = floor;
    }

    public House() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
