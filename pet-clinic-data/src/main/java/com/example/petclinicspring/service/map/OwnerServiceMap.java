package com.example.petclinicspring.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petclinicspring.model.Owner;
import com.example.petclinicspring.service.CrudService;
import com.example.petclinicspring.service.OwnerService;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Set<Owner> findAll() {	
		return super.findAll();
	}

	@Override
	public Owner findById(Long ID) {
		return super.findById(ID);
	}

	@Override
	public Owner save(Owner object) {
		
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long ID) {
		super.deleteById(ID);
		
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

	

}
