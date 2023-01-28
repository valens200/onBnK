package rw.ac.onbank.orm.entities;

import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.enums.TransactionType;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
public  class Loan extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_id", nullable = false)
    private int loanId;
    private TransactionType transactionType = TransactionType.LOAN;
    private double interestRate;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    private double amount;
    private Date executionDate = new Date();

    public Loan(Account account, double amount) {
        this.account = account;
        this.amount = amount;
        this.interestRate = this.account.getAccountType().getInterestRate();

        double actualAmount = this.amount - (this.amount*(this.interestRate/100));

        this.account.incrementBalance(actualAmount);
    }

}