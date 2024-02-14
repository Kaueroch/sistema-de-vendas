package com.vendas.sistema;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Clientes, Long>{

	List<Clientes> findAll();
//oferecer operações basicas do CRUD
	
}
