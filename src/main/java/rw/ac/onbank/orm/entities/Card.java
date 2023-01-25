package rw.ac.onbank.orm.entities;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public  class Card extends BankEntities {
    private long cardId;
    private long cardNumber;
    private String ccv;
    private Date expiryDate;

}