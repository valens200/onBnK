package rw.ac.onbank.orm.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public  class Card extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cardId;
    private long cardNumber;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    private String ccv;
    private Date expiryDate;

    public Card() {

    }

    public Card(long cardNumber, Account account, String ccv, Date expiryDate) {
        this.cardNumber = cardNumber;
        this.account = account;
        this.ccv = ccv;
        this.expiryDate = expiryDate;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}