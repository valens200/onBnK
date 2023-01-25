package rw.ac.onbank.orm.entities;

import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;

@Entity
public class Deposit  extends BankEntities {
    private float amount;
    private float interestRate;

}