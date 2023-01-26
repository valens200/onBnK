package rw.ac.onbank.orm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public  class Account extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long accountId;
    private long accountNumber;
    private  float currentBalance;
    private String type;
}