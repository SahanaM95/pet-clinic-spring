package com.example.petclinicspring.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractMapService<T, ID> {
	
	protected Map<ID, T> map=new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	T findById(Long ID) {
		return map.get(ID);
	}
	
	T save(ID id, T object) {
		map.put(id,object);
		return object;
	}
	
	void delete(T object) {
		map.entrySet().removeIf(temp->temp.getValue().equals(object));
	}
	
	void deleteById(Long ID) {
		map.remove(ID);
	}
}
