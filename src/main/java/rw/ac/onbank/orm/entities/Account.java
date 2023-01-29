package rw.ac.onbank.orm.entities;

import lombok.Builder;
import rw.ac.onbank.orm.entities.enums.AccountType;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
public  class Account extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id", nullable = false)
    private  long accountId;
    private String accountNumber;
    private  double balance;
    private AccountType accountType;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "beneficially_id")
    private Beneficially beneficially;
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Transaction> fromTransactions;

//    @OneToMany(mappedBy = "toAccount", cascade = CascadeType.ALL)
//    private List<Transaction> toTransactions = new ArrayList<Transaction>();

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