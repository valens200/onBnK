package rw.ac.onbank.orm.entities;

import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;

@Entity
public  class Account extends BankEntities {
    private  long accountId;
    private long accountNumber;
    private  float currentBalance;
    private String type;
}