package br.com.edilana.cadastrocliente.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteResource {
	 
	@GetMapping ("/clientes")
	public String hello (@RequestParam(value="name", defaultValue="Banco do Brasil")
							String name,
							@RequestParam(value="endereco", defaultValue="Brasilia DF")
							String endereco)					
	{
				return String.format("Olá, td bem? %s! Seu endereco é Brasília:", name);
		
	}		
}