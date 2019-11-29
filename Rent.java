
package com.example.JPATest;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rent {

	private Date beginRent;
	private Date endRent;
	private long id;
	private Vehicule vehicule;
	private Person person;
	
	public Rent(Date beginRent, Date endRent, long id, Vehicule vehicule, Person person) {
		super();
		this.beginRent = beginRent;
		this.endRent = endRent;
		this.id = id;
		this.vehicule = vehicule;
		this.person = person;
	}
	
	public Rent(Date beginRent, Date endRent) {
		super();
		this.beginRent = beginRent;
		this.endRent = endRent;
	}
	
	public Rent() {
		super();
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToOne
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	public Date getBeginRent() {
		return beginRent;
	}
	public void setBeginRent(Date beginRent) {
		this.beginRent = beginRent;
	}
	public Date getEndRent() {
		return endRent;
	}
	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}
	
}
