package entities;

import java.time.LocalDateTime;

public class BalanceSheet {
    private int id;
    private double balanceAmount;
    private LocalDateTime balanceDate;

    private Customer customer;

    public BalanceSheet(int id, double balanceAmount, LocalDateTime balanceDate, Customer customer) {
        this.id = id;
        this.balanceAmount = balanceAmount;
        this.balanceDate = balanceDate;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public LocalDateTime getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(LocalDateTime balanceDate) {
        this.balanceDate = balanceDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "{" + getBalanceAmount() + " " + getBalanceDate() + " " + getCustomer().getCustomerNumber() + "}";
    }
}
