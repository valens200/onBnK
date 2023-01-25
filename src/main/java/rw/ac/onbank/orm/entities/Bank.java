package rw.ac.onbank.orm.entities;

import javax.persistence.Entity;

@Entity
public class Bank {
    private String bankName;
    private long bankId;
    private String email;
    private String phoneNumber;
    private String securityQuestion;
    private String securityAnswer;
}
