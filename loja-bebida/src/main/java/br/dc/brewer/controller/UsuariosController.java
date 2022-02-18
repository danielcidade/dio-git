package br.dc.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.dc.brewer.model.Usuario;

@Controller
public class UsuariosController {
	
	@RequestMapping("usuarios/novo")
	public String novoUsuario(Usuario usuario) {
		return "usuarios/cadastroUsuario";
	}

}
