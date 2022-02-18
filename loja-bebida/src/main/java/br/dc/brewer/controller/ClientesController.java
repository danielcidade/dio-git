package br.dc.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.dc.brewer.model.Cliente;

@Controller
public class ClientesController {
	
	@RequestMapping("clientes/novo")
	public String novoCliente(Cliente cliente) {
		return "clientes/cadastroCliente";
	}

}
