package com.projetoentra21.AppFii.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.projetoentra21.AppFii.models.Tabela_Fii;
import com.projetoentra21.AppFii.repository.Tabela_FiiRepository;

@Controller
public class DashboardController {
	
	@Autowired
	private Tabela_FiiRepository cr;
	
	@RequestMapping("/dashboard_inicial")
	public String dashboard_inicial()
	{
		return "dashboard_inicial";
	}
	
//	@RequestMapping("/tabelafii")	
//	public String  tabelafii(){		
//		return "tabelafii";


	
	@RequestMapping(value = "/tabelafii", method = RequestMethod.GET)
	public ModelAndView listaFii() {
		ModelAndView mv = new 	ModelAndView("/tabelaFii");			// objeto para renderiar a pagina					
		Iterable<Tabela_Fii> tabela = cr.findAll();

		mv.addObject("ltabelafii", tabela); // leventos atributo 
		return mv;
		
	}
}