package rw.ac.onbank.orm.entities;

import rw.ac.onbank.orm.entities.superEntities.Person;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public  class User extends Person {
    private long securityQuantity;
    private String answer;

    public User(String name, Date date, char gender) {
        super(name, date, gender);
    }
}