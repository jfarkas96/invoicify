package com.ally.invoicify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ally.invoicify.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}