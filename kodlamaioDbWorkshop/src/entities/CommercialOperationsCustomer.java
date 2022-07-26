package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CommercialOperationsCustomer extends IndividualCustomer{


    private LocalDateTime startDate;
    private final List<BalanceSheet> balanceSheets = new ArrayList<>();

    public CommercialOperationsCustomer(int id, int customerNumber, Channel channel, String firstName, String lastName, String nationalityNumber, LocalDateTime startDate) {
        super(id, customerNumber, channel, firstName, lastName, nationalityNumber);
        this.startDate = startDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }


    public List<BalanceSheet> getBalanceSheets() {
        return balanceSheets;
    }

}
