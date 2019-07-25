package com.ally.invoicify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.invoicify.models.Contact;
import com.ally.invoicify.models.Company;
import com.ally.invoicify.models.User;
import com.ally.invoicify.repositories.ContactRepository;
import com.ally.invoicify.repositories.CompanyRepository;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
	
	@Autowired
    CompanyRepository companyRepository;

	@Autowired
	ContactRepository contactRepo;
	
	@GetMapping
	public List<Contact> getAll(){
		return contactRepo.findAll();
	}
	
	@GetMapping("{id}")
	public Contact getOne(@PathVariable long id){
		return contactRepo.findOne(id);
	}
	/*
	@PostMapping
	public Contact create(@RequestBody Contact contact, Authentication auth){
		User user = (User) auth.getPrincipal();
		long idtest=2;
		Company client = companyRepository.findOne(idtest);
        contact.setClient(client);
        contact.setUser(user);
		return contactRepo.save(contact);
	}
*/
	@PostMapping("{id}")
	public Contact create(@RequestBody Contact contact){
		Long id = 2L;
		Company client = companyRepository.findOne(id);
        contact.setClient(client);
		return contactRepo.save(contact);
	}


	
	@PutMapping("{id}")
	public Contact update(@RequestBody Contact contact, @PathVariable long id){
		contact.setId(id);
		return contactRepo.save(contact);
	}
	
	@DeleteMapping("{id}")
	public Contact update(@PathVariable long id){
		Contact original = contactRepo.findOne(id);
		contactRepo.delete(original);
		return original;
	}
}