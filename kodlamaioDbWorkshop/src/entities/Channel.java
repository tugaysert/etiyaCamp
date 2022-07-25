package entities;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private int id;
    private String channelName;
    private final List<Customer> customers = new ArrayList<>();

    public Channel(int id, String channelName) {
        this.id = id;
        this.channelName = channelName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }


    @Override
    public String toString() {
        return "{" + getChannelName()  + "}";
    }
}
