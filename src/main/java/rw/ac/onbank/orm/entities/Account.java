package rw.ac.onbank.orm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.enums.AccountType;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public  class Account extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false)
    private  long accountId;
    private String accountNumber;
    private  double balance;
    private AccountType accountType;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @OneToMany(mappedBy = "fromAccount", cascade = CascadeType.ALL)
    private List<Transaction> fromTransactions = new ArrayList<Transaction>();

    @OneToMany(mappedBy = "toAccount", cascade = CascadeType.ALL)
    private List<Transaction> toTransactions = new ArrayList<Transaction>();

    public Account() {

    }

    public Account(String accountNumber, AccountType accountType, Bank bank) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.bank = bank;
        this.balance = 10000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public List<Transaction> getFromTransactions() {
        return fromTransactions;
    }

    public void setFromTransactions(List<Transaction> fromTransactions) {
        this.fromTransactions = fromTransactions;
    }

    public List<Transaction> getToTransactions() {
        return toTransactions;
    }

    public void setToTransactions(List<Transaction> toTransactions) {
        this.toTransactions = toTransactions;
    }

    public double getBalance() {
        return this.balance;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public double incrementBalance(double amount) {
        this.balance = this.balance + amount;

        return balance;
    }

    public double decrementBalance(double amount) {
        this.balance = this.balance - amount;

        return balance;
    }
}