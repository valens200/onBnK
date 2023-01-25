package rw.ac.onbank.orm.entities;

import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;
import java.util.Date;

@Entity

public class Bill extends BankEntities {
    private long billId;
    private long billAMount;
    private Date billDueDate;

}