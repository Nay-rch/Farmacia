package com.generation.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{

	Object findByNomeOrLaboratorio(String nome, String laboratorio);

	static Object findByContainingIgnoreCase(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

	


