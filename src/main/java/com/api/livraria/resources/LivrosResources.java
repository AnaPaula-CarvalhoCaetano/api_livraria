package com.api.livraria.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.livraria.domain.Livros;
import com.api.livraria.repositories.LivrosRepository;
import com.api.livraria.services.LivrosService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value= "/api")
public class LivrosResources {
	
	@Autowired
	private LivrosService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livros> findById(@PathVariable Long id){
		Livros obj = this.service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/livros")
	public ResponseEntity<List<Livros>> findAll() {
		List<Livros> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Livros> update(@PathVariable Long id, @RequestBody Livros obj){
		Livros newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	
	@PostMapping("/livros")
	public ResponseEntity<Livros> create(@RequestBody Livros obj) {
		Livros newObj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
	
}







