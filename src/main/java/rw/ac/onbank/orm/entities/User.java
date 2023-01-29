package rw.ac.onbank.orm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.onbank.orm.entities.superEntities.Person;

import javax.persistence.*;
import java.util.Date;

@Entity
public  class User extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;
    
    public User(String firstName, String lastName,  String email, Date dob, String phone, String password, String question, String answer, Long userId, String firstname, String lastname, String phone1, Date dateOfBirth, String password1, String securityQuestion, String securityAnswer) throws Exception {
        super(firstName, lastName, email,  dob, phone, password, question, answer);
    }
    public User(){
        super();
    }
}