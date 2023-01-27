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
    private String phone;
    @NonNull
    private Date dateOfBirth;
    @NonNull
    private String password;
    private String securityQuestion;
    private String securityAnswer;
    public Person ( String firstName, String  lastName, Date dob,  String phone, String password) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dateOfBirth = dob;

        this.password = PasswordHashing.hashPassword(password);
    }
     public Person ( String firstName, String  lastName, Date dob,  String phone, String password, String question, String answer) throws Exception {
         this.firstName = firstName;
         this.lastName = lastName;
         this.phone = phone;
         this.dateOfBirth = dob;

        this.password = PasswordHashing.hashPassword(password);

         this.securityQuestion = question;
         this.securityAnswer = answer;
     }
     public  Person(){

     }

}
