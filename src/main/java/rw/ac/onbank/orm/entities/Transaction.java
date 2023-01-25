package rw.ac.onbank.orm.entities;

import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public  class Transaction  extends BankEntities {
    private long  transactionId;
    private long transactionNumber;
    private String type;
    private Date executionDate;

}