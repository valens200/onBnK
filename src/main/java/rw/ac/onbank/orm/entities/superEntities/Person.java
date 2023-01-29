package rw.ac.onbank.orm.entities.superEntities;

import lombok.Data;
import lombok.NonNull;
import rw.ac.onbank.orm.helpers.PasswordHashing;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Data
public  class Person implements Serializable {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String userName;
    @NonNull
    private String phone;
    @NonNull
    private Date dateOfBirth;
    @NonNull
    private String password;
    @NonNull
    @Column(name = "email", unique = true)
    private String email;
    private String securityQuestion;
    private String securityAnswer;

     public Person ( String firstName, String  lastName, String email, Date dob,  String phone, String password, String question, String answer) throws Exception {
         this.firstName = firstName;
         this.lastName = lastName;
         this.phone = phone;
         this.dateOfBirth = dob;
         this.email = email;
         this.password = PasswordHashing.hashPassword(password);
         this.securityQuestion = question;
         this.securityAnswer = answer;
     }
     public  Person(){

     }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public String getUserName() {
        return userName;
    }
}
