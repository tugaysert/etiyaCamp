package entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    private int id;
    private int customerNumber;

    private Channel channel;
    private List<Address> addresses = new ArrayList<>();

    public Customer(int id, int customerNumber, Channel channel) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.channel = channel;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "{" + getCustomerNumber() +"}";
    }
}
