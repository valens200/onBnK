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
    private String firstname;
    private String lastname;
    private String phone;
    private Date dateOfBirth;
    private String password;

    private String securityQuestion;
    private String securityAnswer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;

    public User(String firstName, String lastName, Date dob, String phone, String password, Long userId, String firstname, String lastname, String phone1, Date dateOfBirth, String password1) throws Exception {
        super(firstName, lastName, dob, phone, password);
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone1;
        this.dateOfBirth = dateOfBirth;
        this.password = password1;
    }

    public User(String firstName, String lastName, Date dob, String phone, String password, String question, String answer, Long userId, String firstname, String lastname, String phone1, Date dateOfBirth, String password1, String securityQuestion, String securityAnswer) throws Exception {
        super(firstName, lastName, dob, phone, password, question, answer);
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone1;
        this.dateOfBirth = dateOfBirth;
        this.password = password1;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }

    @Override
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    @Override
    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    @Override
    public String getSecurityAnswer() {
        return securityAnswer;
    }

    @Override
    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public User(){
        super();
    }
}