package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CommercialOperations {

    private int id;
    private LocalDateTime startDate;

    private IndividualCustomer individualCustomer;
    private final List<BalanceSheet> balanceSheets = new ArrayList<>();

    public CommercialOperations(int id, LocalDateTime startDate, IndividualCustomer individualCustomer) {
        this.id = id;
        this.startDate = startDate;
        this.individualCustomer = individualCustomer;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public IndividualCustomer getIndividualCustomer() {
        return individualCustomer;
    }

    public void setIndividualCustomer(IndividualCustomer individualCustomer) {
        this.individualCustomer = individualCustomer;
    }

    public List<BalanceSheet> getBalanceSheets() {
        return balanceSheets;
    }

}
