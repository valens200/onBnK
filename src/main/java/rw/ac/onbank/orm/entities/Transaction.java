package rw.ac.onbank.orm.entities;

import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity

public  class Transaction  extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  transactionId;
    private long transactionNumber;
    private String type;
    private Date executionDate;

}