package rw.ac.onbank.orm.entities;

import rw.ac.onbank.orm.entities.superEntities.BankEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deposit  extends BankEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private float amount;
    private float interestRate;

}