package com.vendas.sistema;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Clientes, Long>{

	List<Clientes> findAll();
//oferecer operações basicas do CRUD
	
}
//JpaRepository<Clientes, Long>: Especifica que esta interface está associada à entidade Clientes e usa chaves primárias do tipo Long.

//List<Clientes> findAll();: Define um método para recuperar todos os registros da entidade Clientes no banco de dados. O Spring Data JPA implementa automaticamente este método, permitindo que você busque todos os registros sem a necessidade de escrever a consulta SQL manualmente.