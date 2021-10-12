package model;

import java.io.Serializable;

public class Bill implements Serializable {
    private String code;
    private Customer customer;
    private int oldIndex;
    private int newIndex;
    
    public int getNumber(){
        return newIndex - oldIndex;
    }


    public int getTotalAmount(){
        return getNumber()*750;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "code='" + code + '\'' +
                ", customer=" + customer.getFullName() +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                '}';
    }

    public Bill() {
    }

    public Bill(String code, Customer customer, int oldIndex, int newIndex) {
        this.code = code;
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }
}
