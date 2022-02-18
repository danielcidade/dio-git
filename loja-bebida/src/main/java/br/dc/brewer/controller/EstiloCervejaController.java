package br.dc.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstiloCervejaController {
		
		@RequestMapping("estilo/novo")
		public String novaCidade() {
			return "estiloCerveja/cadastroEstiloCerveja";
		

	}


}
