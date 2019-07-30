package com.ally.invoicify.models;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Contact{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    private String client;

    @ManyToOne
    private User createdBy;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String type;

    public Contact(){

    }

    public Contact(String firstName, String lastName, String phoneNumber, String email, String type, String client, User createdBy){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
        this.client = client;
        this.createdBy = createdBy;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getClient(){
        return this.client;
    }

    public void setClient(String client){
        this.client = client;
    }

    public User getUser(){
        return this.createdBy;
    }

    public void setUser(User user){
        this.createdBy = user;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }
}