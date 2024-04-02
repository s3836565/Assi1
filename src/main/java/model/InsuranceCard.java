package model;
import java.util.Date; // Import the Date class from the java.util package
public class InsuranceCard {
    private String cardNumber; // 10 digits
    private Customer cardHolder;
    private Date expirationDate;

    public InsuranceCard(String cardNumber, Customer cardHolder, Date expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Customer getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(Customer cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    // Constructor, getters, and setters...
}
