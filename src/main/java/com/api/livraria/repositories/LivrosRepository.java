package com.api.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.livraria.domain.Livros;

@Repository
public interface LivrosRepository extends JpaRepository<Livros, Long>{
	
	

}
