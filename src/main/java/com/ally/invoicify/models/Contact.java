package com.ally.invoicify.models;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public abstract class Contact{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

    @ManyToOne
    private Company client;

    @ManyToOne
    private User createdBy;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String type;

    public Contact(Company client, User createdBy, 
    String firstName, String lastName, String email, String type){
        this.client = client;
        this.createdBy = createdBy;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.type = type;
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