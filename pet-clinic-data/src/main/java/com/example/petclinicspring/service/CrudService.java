package com.example.petclinicspring.service;

import java.util.Set;

public interface CrudService<T, ID>{
	
	Set<T> findAll();
	
	T findById(Long ID);
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(Long ID);
}
