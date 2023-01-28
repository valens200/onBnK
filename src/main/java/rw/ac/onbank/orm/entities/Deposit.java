package rw.ac.onbank.orm.entities;

import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.enums.TransactionType;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Deposit  extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double interestRate;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    private TransactionType transactionType = TransactionType.DEPOSIT;

    private double amount;

    public Deposit(Account account, double amount) {
        this.account = account;
        this.interestRate = this.account.getAccountType().getInterestRate();
        this.amount = amount;

        double actualAmount = this.amount - (this.amount*(this.interestRate/100));

        this.account.decrementBalance(actualAmount);
    }
}