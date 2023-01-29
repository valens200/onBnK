package rw.ac.onbank.orm.entities;

import lombok.NonNull;
import rw.ac.onbank.orm.entities.superEntities.Person;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;
    @OneToMany(
            cascade = CascadeType.DETACH
    )
    @JoinColumn(
            name = "user_email"
    )
    private Set<Account> accounts = new HashSet<Account>();

    public User(String firstName, String lastName, Date dob, String phone, String password) throws Exception {
        super(firstName, lastName, dob, phone, password);
    }

    public User(String firstName, String lastName, Date dob, String phone, String password, String question,
            String answer) throws Exception {
        super(firstName, lastName, dob, phone, password, question, answer);
    }

    @Override
    public String getSecurityQuestion() {
        return super.securityQuestion;
    }

    @Override
    public void setSecurityQuestion(String securityQuestion) {
        super.securityQuestion = securityQuestion;
    }

    @Override
    public String getSecurityAnswer() {
        return super.securityAnswer;
    }

    @Override
    public void setSecurityAnswer(String securityAnswer) {
        super.securityAnswer = securityAnswer;
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public String getEmail() {
        return super.email;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return super.firstName;
    }

    public void setFirstname(String firstname) {
        super.firstName = firstname;
    }

    public String getLastname() {
        return super.lastName;
    }

    public void setLastname(String lastname) {
        super.lastName = lastname;
    }

    @NonNull
    @Override
    public String getPhone() {
        return super.phone;
    }

    @Override
    public void setPhone(String phone) {
        super.phone = phone;
    }

    @NonNull
    @Override
    public Date getDateOfBirth() {
        return super.dateOfBirth;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        super.dateOfBirth = dateOfBirth;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}