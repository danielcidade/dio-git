package br.dc.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CidadeController {
	
	@RequestMapping("cidade/novo")
	public String novaCidade() {
		return "cidade/cadastroCidade";
	}

}
