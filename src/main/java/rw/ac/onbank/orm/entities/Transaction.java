package rw.ac.onbank.orm.entities;

import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.enums.TransactionType;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.Date;

@Entity
@NoArgsConstructor
public  class Transaction  extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id", nullable = false)
    private long  transactionId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    Account fromAccount;
    @ManyToOne
    @JoinColumn(name = "account_id")
    Account toAccount;

    private double amount;

    private TransactionType transactionType;

    private Date executionDate = new Date();
    private double interestRate;

    public Transaction(Account fromAccount, Account toAccount, double amount, TransactionType transactionType) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.transactionType = transactionType;

        if(this.transactionType == TransactionType.TRANSFER && this.toAccount != null) {
            double actualAmount = this.amount - (this.amount*(this.interestRate/100));

            this.fromAccount.decrementBalance(actualAmount);
            this.toAccount.incrementBalance(actualAmount);
        }
    }

    public Transaction(Account fromAccount, double amount, TransactionType transactionType) {
        this.fromAccount = fromAccount;
        this.amount = amount;
        this.transactionType = transactionType;

        if(this.transactionType == TransactionType.WITHDRAWAL) {
            double actualAmount = this.amount - (this.amount*(this.interestRate/100));

            this.fromAccount.decrementBalance(actualAmount);
        }
    }
}