package com.example.petclinicspring.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petclinicspring.model.Pet;
import com.example.petclinicspring.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Set<Pet> findAll() {	
		return super.findAll();
	}

	@Override
	public Pet findById(Long ID) {
		return super.findById(ID);
	}

	@Override
	public Pet save(Pet object) {
		
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long ID) {
		super.deleteById(ID);
		
	}

	

}
