package rw.ac.onbank.orm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beneficially {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long beneficiallyId;
    private String beneficiallyName;
    private long accountNumber;
    private String ifcCode;

}
