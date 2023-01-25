package rw.ac.onbank.orm.entities;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private int streetNumber;

	public Address(int streetNumber) {
		this.streetNumber = streetNumber;
	}
}
