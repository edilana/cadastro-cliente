package br.com.edilana.cadastrocliente.resource;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edilana.cadastrocliente.model.Cliente;
import br.com.edilana.cadastrocliente.model.Endereco;

@RestController
public class ClienteResource {

	/* Consulta */
	@GetMapping("/clientes")
	public String getCliente(@RequestParam(value = "name", defaultValue = "Banco do Brasi") String name) {

		/* String listaClientes = popularObjetos(); */
		ArrayList<Cliente> listaClientes = popularObjetos();

		for (int i = 0; i < listaClientes.length(); i++) {
			if (listaClientes.contains(name)) {
				System.out.println("Nome encontrado");
				/* return "Nome encontrado"; */
				return String.format("Nome encontrado: %s!", name);
			} else {
				/* return "Nome não encontrado"; */
				return String.format("Nome não encontrado: %s!", name);
			}
		}

		return String.format("Nome encontrado: %s!", name);

	}

	/* Inclusao */
	@GetMapping("/inclusaoclientes")
	public static String PutCliente(
			@RequestParam(value = "nameInclusao", defaultValue = "Banco do Brasil") String nameInclusao,
			@RequestParam(value = "idade", defaultValue = "1") int idade) {
		inclusao(nameInclusao, idade);
		System.out.println(inclusao(nameInclusao, idade));
		return String.format("Nome e idade incluídos: %s, %s!", nameInclusao, idade);
	}

	/* Exclusão */
	@GetMapping("/exclusaoclientes")
	public static String Delete(
			@RequestParam(value = "nameExclusao", defaultValue = "Banco do Brasil") String nameExclusao) {
		exclusao(nameExclusao);
		/* System.out.println(exclusao(nameExclusao)); */
		return String.format("Nome excluído: %s", nameExclusao); 
		}

	
    /* Alteração */	  
	@GetMapping("/exclusaoclientes") 
	public static String Update(
			@RequestParam(value = "nameAlteracao", defaultValue = "Banco do Brasil") String nameAlteracao,
			@RequestParam(value = "idadeAlteracao", defaultValue = "90") String idadeAlteracao) {
	  alteracao(nameAlteracao);
	  return String.format("Nome alterado: %s", nameAlteracao);
	  }
	 

	/*
	 * Lista Clientes
	 * 
	 * @GetMapping("/listaclientes") public static String ListaCliente() {
	 * ArrayList<Cliente> listaClientes = new ArrayList<Cliente>(); return
	 * listaClientes; }
	 */

	public static ArrayList<Cliente> popularObjetos() {

		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

		Cliente cliente = new Cliente();
		cliente.setNome("Gineude");
		cliente.setIdade(59);
		Endereco endereco = new Endereco();
		endereco.setRua("do trem");
		endereco.setNumero(24);
		cliente.setEndereco(endereco);

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Gi");
		cliente1.setIdade(21);
		Endereco endereco1 = new Endereco();
		endereco1.setRua("do gooogle");
		endereco1.setNumero(69);
		cliente.setEndereco(endereco1);

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Edilana");
		cliente2.setIdade(15);
		Endereco endereco2 = new Endereco();
		endereco2.setRua("Brasilia");
		endereco2.setNumero(15);
		cliente.setEndereco(endereco2);

		listaClientes.add(cliente);
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);

		return listaClientes;
	}

	public static String inclusao(String name, int idade) {

		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

		Cliente clienteNovo = new Cliente();
		clienteNovo.setNome(name);
		clienteNovo.setIdade(idade);
		listaClientes.add(clienteNovo);

		return listaClientes.toString();
	}

	public static String exclusao(String name) {

		ArrayList<Cliente> listaClientes = popularObjetos();

		Iterator<Cliente> iterator = listaClientes.iterator();
		while (iterator.hasNext()) {
			Cliente next = iterator.next();
			if (next.equals(1)) {
				iterator.remove();
				/*return String.format("Nome excluído: %s!", name); */
				System.out.println("Nome excluído");
			} else {
				/*return String.format("Nome não encontrado: %s!", name);*/
				System.out.println("Nome não encontrado");
			}
		}
			return listaClientes.toString(); 
	}

	
	  public static String alteracao(String name) {
	  
	  ArrayList<Cliente> listaClientes = popularObjetos();
	  
	  Iterator<Cliente> iterator = listaClientes.iterator(); 
	  while (iterator.hasNext()) { 
		  Cliente next = iterator.next(); 
		  if (next.equals(1)) {
			  iterator.remove(); 
			  return String.format("Nome alterado: %s!", name);
		  } else {
		      return String.format("Nome não encontrado: %s!", name); } 
		  } 
	  return listaClientes.toString(); }
	 

}
