package model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String fullName;
    private String address;
    private String code;

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public Customer() {
    }

    public Customer(String fullName, String address, String code) {
        this.fullName = fullName;
        this.address = address;
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
