package com.example.petclinicspring.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petclinicspring.model.Owner;
import com.example.petclinicspring.model.Pet;
import com.example.petclinicspring.model.Vet;
import com.example.petclinicspring.service.OwnerService;
import com.example.petclinicspring.service.PetService;
import com.example.petclinicspring.service.VetService;


@Component
public class DataLoader implements CommandLineRunner {

	
	private final PetService pet;
	
	private final VetService vet;
	
	private final OwnerService owner;
	
	public DataLoader(PetService pet, VetService vet, OwnerService owner) {
		super();
		this.pet = pet;
		this.vet = vet;
		this.owner = owner;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner o1=new Owner();
		o1.setId(1L);
		o1.setFirstName("Mark");
		o1.setLastName("Twain");
		owner.save(o1);
		
		Owner o2=new Owner();
		o2.setId(2L);
		o2.setFirstName("Mars");
		o2.setLastName("Bar");
		owner.save(o2);
		
		
		Vet v1=new Vet();
		v1.setId(1L);
		v1.setFirstName("Doc");
		v1.setLastName("Veter");
		vet.save(v1);
		
		Pet p1=new Pet();
		p1.setId(1L);
		p1.setOwner(o2);
		p1.setVet(v1);
		pet.save(p1);
		
		System.out.println("Loaded data");
		
	
		
		
		
	}

}
