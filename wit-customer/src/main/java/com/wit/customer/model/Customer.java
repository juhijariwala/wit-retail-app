package com.wit.customer.model;

public class Customer {

    private long id;
    private String name;
    private String emailAddress;
    private String password;
    private long mobileNumber;

    public Customer() {
        this.id = 0L;
    }

    public long getId() {
        return id;
    }

    public Customer setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public Customer setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
