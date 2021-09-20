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

		
		ArrayList<Cliente> listaClientes = popularObjetos();

		for (int i = 0; i < listaClientes.size(); i++) {
			Cliente cliente = listaClientes.get(i);
			System.out.println(cliente.getNome());
			System.out.println(name);
			if (cliente.getNome().contains(name)) {
				return String.format("Nome encontrado: %s!", name);
				/* return "Nome encontrado"; */
			} 
		}
		return String.format("Nome não encontrado: %s!", name);
	}

	/* Inclusao */
	@GetMapping("/inclusaoclientes")
	public static String PutCliente(
			@RequestParam(value = "nameInclusao", defaultValue = "Banco do Brasil") String nameInclusao,
			@RequestParam(value = "idade", defaultValue = "1") int idade) {
		/* inclusao(nameInclusao, idade); */
		String listaClientes = inclusao(nameInclusao, idade);
		System.out.println(listaClientes);
		/* System.out.println(inclusao(nameInclusao, idade)); */
		return String.format("Nome e idade incluídos: %s, %s!", nameInclusao, idade);
	}

	/* Exclusão */
	@GetMapping("/exclusaoclientes")
	public static String Delete(
			@RequestParam(value = "nameExclusao", defaultValue = "Banco do Brasil") String nameExclusao) {
		String listaClientes = exclusao(nameExclusao);
		System.out.println(listaClientes);
		return listaClientes;
	}

	/* Alteração */
	@GetMapping("/alteracaoclientes")
	public static String Update(
			@RequestParam(value = "nameUpdate", defaultValue = "Banco do Brasil") String nameUpdate,
			@RequestParam(value = "idadeUpdate", defaultValue = "50") int idadeUpdate) {
		String listaClientes = alteracao(nameUpdate, idadeUpdate);
		System.out.println(listaClientes);
		return listaClientes;
	}
	
	
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

		Cliente cliente3 = new Cliente();
		cliente3.setNome("Anderson");
		cliente3.setIdade(15);
		Endereco endereco3 = new Endereco();
		endereco3.setRua("Guara");
		endereco3.setNumero(20);
		cliente.setEndereco(endereco3);

		listaClientes.add(cliente);
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);

		System.out.println(listaClientes);
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
            Cliente cliente = (Cliente) iterator.next();
            if (cliente.getNome().equalsIgnoreCase(name)) {
                iterator.remove();
            	return String.format("Nome excluído: %s!", name);
			} 
      	}
		 return String.format("Nome não encontrado: %s!", name);
	}

	
	public static String alteracao(String name, int idade) {

		ArrayList<Cliente> listaClientes = popularObjetos();

		for (Cliente cliente : listaClientes) {
			if (cliente.getNome().equals(name)) {
				cliente.setIdade(idade);
				return String.format("Nome alterado: %s!", name);
			}
		}
		return String.format("Nome não encontrado: %s!", name);
	}

}
