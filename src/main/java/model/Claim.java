package model;

import java.util.Date;
import java.util.List;

public class Claim {
    private String id; // Format: f-0000000000
    private Date claimDate;
    private String cardNumber;
    private double claimAmount;
    private String status; // New, Processing, Done

    public Claim(String id, Date claimDate, String cardNumber, double claimAmount, String status) {
        this.id = id;
        this.claimDate = claimDate;
        this.cardNumber = cardNumber;
        this.claimAmount = claimAmount;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    // Constructor, getters, and setters...
}
