package entities;

public class Address {
    private int id;
    private String detail;

    private Customer customer;

    public Address(int id, String detail, Customer customer) {
        this.id = id;
        this.detail = detail;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "{" + getDetail() +" "+ getCustomer().getCustomerNumber() + "}";
    }
}
