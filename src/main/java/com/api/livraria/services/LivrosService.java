package com.api.livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.livraria.domain.Livros;
import com.api.livraria.repositories.LivrosRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class LivrosService {
	
	@Autowired
	private LivrosRepository repository;
	
	public Livros findById(Long id) {
		java.util.Optional<Livros> obj = repository.findById(id);
		return obj.orElseThrow();
	}
	
	public List<Livros> findAll(){
		return repository.findAll();
	}
	
	public Livros update(Long id, Livros obj) {
		Livros newObj = findById(id);
		newObj.setTitle(obj.getTitle());
		newObj.setCategoria(obj.getCategoria());

		return repository.save(newObj);
	}

	public Livros create(Livros obj) {
		obj.setId(0);
		return repository.save(obj);
	}
	public void delete(Long id) {
		findById(id);
		repository.deleteById(id);
	}
}
