package rw.ac.onbank.orm.entities.superEntities;

import lombok.Data;
import lombok.NonNull;
import rw.ac.onbank.orm.helpers.PasswordHashing;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Data
abstract public  class Person implements Serializable {
    @NonNull
    protected String firstName;
    @NonNull
    protected String lastName;
    @NonNull
    protected String phone;
    @NonNull
    protected Date dateOfBirth;
    @NonNull
    protected String password;
    protected String securityQuestion;
    protected String securityAnswer;
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
