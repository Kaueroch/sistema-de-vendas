package com.vendas.sistema;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController //serve para dizer que esta classe é um controlador que lida com solicitações Restful.
@RequestMapping("/clientes") // é específica para construir controladores que produzem saída JSON ou XML diretamente para a resposta HTTP(pagina no navegador, tanto que tem o /clientes para acessar no navegador com a porta e o /clientes.
public class ClienteController {
  @Autowired //Isso significa que o Spring cuidará de criar uma instância do ClienteRepository e atribuí-la automaticamente a clienteRepository, permitindo que você use métodos do repositório para interagir com o banco de dados.
  private ClienteRepository clienteRepository;
  
  @GetMapping
  public List<Clientes> getAllClientes(){
   return clienteRepository.findAll(); //O objetivo é obter todos os clientes do banco de dados e retorná-los como uma lista.
  }
  @GetMapping("/{id}")
  public Clientes getClientebyId(@PathVariable Long id) {
	  return clienteRepository.findById(id).orElse(null);
    //essa linha serve para recuperar um cliente específico do banco de dados com base no ID fornecido na URL da requisição
  }
  @PostMapping
  public Clientes adicionaCliente(@RequestBody Clientes cliente) {
	  return clienteRepository.save(cliente); //Ele recebe um objeto Clientes no corpo da requisição (@RequestBody) e utiliza o clienteRepository para salvar esse cliente no banco de dados, retornando o cliente recém-criado como resposta
  }
  @DeleteMapping
  public void removerCliente(@PathVariable Long id) {
	  clienteRepository.deleteById(id); 
  }//pega a lista do repositorio e vai até o id para dar o delete.
} //testar o Postman de novo amanha
//clientes pronto
