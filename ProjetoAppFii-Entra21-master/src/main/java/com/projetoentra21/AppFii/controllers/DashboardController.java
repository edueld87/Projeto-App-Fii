package com.projetoentra21.AppFii.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.projetoentra21.AppFii.models.Carteira;
import com.projetoentra21.AppFii.models.Tabela_Fii;
import com.projetoentra21.AppFii.repository.CarteiraRepository;
import com.projetoentra21.AppFii.repository.Tabela_FiiRepository;

@Controller
public class DashboardController {
	
	@Autowired
	private Tabela_FiiRepository cr;
	
	@Autowired
	private CarteiraRepository er;
	
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
	
	@RequestMapping(value = "/cadastroCarteira", method= RequestMethod.GET)
	public String form() {
		return "/formCarteira";

	}

	@RequestMapping(value = "/cadastroCarteira", method= RequestMethod.POST)
	public String form(@Valid Carteira carteira, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastroCarteira";

		}
		er.save(carteira);
		attributes.addFlashAttribute("mensagem", "Salvo com sucesso!");	
		return "redirect:/cadastroCarteira";
	}
	
	@RequestMapping("/")	
	public ModelAndView listaCarteira(){		
		ModelAndView mv = new ModelAndView("/listaCarteira"); // objeto para renderiar a pagina					
		Iterable<Carteira> carteira = er.findAll();		
		mv.addObject("lcarteira", carteira); // leventos atributo //que está no HTML			  
		return mv;
 }
	
//	@RequestMapping(value ="/{codigo}", method = RequestMethod.GET)
//	public ModelAndView detalhesCarteira(@PathVariable("codigo") String codigo) {
//		Carteira carteira = er.findByCodigo(codigo);
//		ModelAndView mv = new ModelAndView("/detalhesCarteira");
//		mv.addObject("evento", carteira);
//
//		Iterable<Carteira> carteira = er.findByCodigo(carteira);
//		mv.addObject("convidados", carteira);
//		return mv;
//	}
//
//	@RequestMapping(value ="/{codigo}", method = RequestMethod.POST)
//	public String detalhesEventoPost(@PathVariable("codigo") long codigo, @Valid Carteira carteira, BindingResult result,
//			RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
//			return "redirect:/{codigo}";
//		}
//
//		Evento evento = er.findByCodigo(codigo);
//		convidado.setEvento(evento);
//		cr.save(convidado);
//		attributes.addFlashAttribute("mensagem", "Convidado adicionado com sucesso!");
//		return "redirect:/{codigo}";
//	}	
}	
	