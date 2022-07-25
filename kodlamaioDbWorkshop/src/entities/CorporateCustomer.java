package entities;

import java.util.ArrayList;
import java.util.List;

public class CorporateCustomer extends Customer{
    private String companyName;
    private String taxNo;
    private final List<BalanceSheet> balanceSheets = new ArrayList<>();

    public CorporateCustomer(int id, int customerNumber, Channel channel, String companyName, String taxNo) {
        super(id, customerNumber, channel);
        this.companyName = companyName;
        this.taxNo = taxNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public List<BalanceSheet> getBalanceSheets() {
        return balanceSheets;
    }

}
