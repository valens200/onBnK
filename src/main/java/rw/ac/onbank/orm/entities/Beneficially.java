package rw.ac.onbank.orm.entities;

import javax.persistence.Entity;

@Entity
public class Beneficially {
    private long beneficiallyId;
    private String beneficiallyName;
    private long accountNumber;
    private String ifcCode;

}
