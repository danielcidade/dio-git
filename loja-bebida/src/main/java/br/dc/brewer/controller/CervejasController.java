package br.dc.brewer.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.dc.brewer.model.Cerveja;

@Controller
public class CervejasController {
	
	private static final Logger logger = LoggerFactory.getLogger(CervejasController.class);

	@RequestMapping("cervejas/novo")
	public String novo(Cerveja cerveja)
	{
		logger.error("nível error");
		logger.info("nível info");
		return "cervejas/cadastroCerveja";
	}
	
	@RequestMapping(value = "cervejas/novo", method = RequestMethod.POST)
	public String salvar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes)
	{
		if(result.hasErrors())
		{
			return novo(cerveja);
		}
		
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		return "redirect:/cervejas/novo";
	}
	
	@RequestMapping("cervejas/cadastro")
	public String cadastro()
	{
		return "cervejas/cadastro-produto";
	}

}
