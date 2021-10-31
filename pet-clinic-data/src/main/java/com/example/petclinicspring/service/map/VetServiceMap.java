package com.example.petclinicspring.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petclinicspring.model.Vet;
import com.example.petclinicspring.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Set<Vet> findAll() {	
		return super.findAll();
	}

	@Override
	public Vet findById(Long ID) {
		return super.findById(ID);
	}

	@Override
	public Vet save(Vet object) {
		
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long ID) {
		super.deleteById(ID);
		
	}

	

}
