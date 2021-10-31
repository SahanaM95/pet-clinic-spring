package com.example.petclinicspring.service;


import com.example.petclinicspring.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
