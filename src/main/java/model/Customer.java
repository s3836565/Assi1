package model;

public class Customer {
    protected String id_cus; // Format: c-0000000
    protected String fullName;
    protected InsuranceCard insuranceCard;

    public Customer(String id_cus, String fullName, InsuranceCard insuranceCard) {
        this.id_cus = id_cus;
        this.fullName = fullName;
        this.insuranceCard = insuranceCard;
    }

    public String getId_cus() {
        return id_cus;
    }

    public void setId_cus(String id_cus) {
        this.id_cus = id_cus;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public InsuranceCard getInsuranceCard() {
        return insuranceCard;
    }

    public void setInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCard = insuranceCard;
    }
    // Constructor, getters, and setters...
}
