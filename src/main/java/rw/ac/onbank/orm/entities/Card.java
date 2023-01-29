package rw.ac.onbank.orm.entities;
import lombok.Data;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public  class Card extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cardId;
    private long cardNumber;
    private String ccv;
    private Date expiryDate;
}