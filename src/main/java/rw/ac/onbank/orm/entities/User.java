package rw.ac.onbank.orm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.superEntities.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public  class User extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    public User(String firstName, String lastName, String userName, Date dob, String email, String password, String question, String answer) {
        super(firstName, lastName, userName, dob, email, password, question, answer);
    }
    public User(){
        super();
    }
}