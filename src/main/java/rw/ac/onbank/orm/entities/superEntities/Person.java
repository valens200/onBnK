package rw.ac.onbank.orm.entities.superEntities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Data
public  class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private Date dateOfBirth;
    private char gender;
    private String securityQuestion;
    private String answer;
     public   Person ( String firstName, String  lastName, String userName, Date dob,  String email, String password, String question, String answer){
         this.firstName = firstName;
         this.lastName = lastName;
         this.userName = userName;
         this.email = email;
         this.dateOfBirth = dob;
         this.securityQuestion = question;
         this.answer = answer;
     }

}
