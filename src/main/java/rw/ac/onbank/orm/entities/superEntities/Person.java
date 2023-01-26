package rw.ac.onbank.orm.entities.superEntities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Data
public  class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String userName;
    @NonNull
    @Column(unique = true)
    private String email;
    private Date dateOfBirth;
    private char gender;
    private String securityQuestion;
    private String answer;
    private String password;
    //constructor on person
     public   Person ( String firstName, String  lastName, String userName, Date dob,  String email, String password, String question, String answer){
         this.firstName = firstName;
         this.lastName = lastName;
         this.userName = userName;
         this.email = email;
         this.dateOfBirth = dob;
         this.securityQuestion = question;
         this.answer = answer;
     }

     //default constructor for person class
     public  Person(){

     }

}
