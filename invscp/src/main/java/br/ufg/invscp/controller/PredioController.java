package br.ufg.invscp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufg.invscp.model.Predio;
import br.ufg.invscp.model.dto.PredioDTO;
import br.ufg.invscp.service.LocalizationService;
import br.ufg.invscp.service.PredioService;

@Controller
@RequestMapping("predio")
public class PredioController {
	
	@Autowired
	private LocalizationService localizationService;
	
	@Autowired 
	private PredioService predioService;
	
	@PostMapping("/create")
	public ModelAndView save(PredioDTO  predio, Model model) {
		predioService.save(predio);
		return findAll(model);
	}
	
	@RequestMapping("/new")
	public ModelAndView novoPredio(Model model) {
		model.addAttribute("predio", new PredioDTO());
		model.addAttribute("localizacoes", localizationService.findAllLocalizations());
		return new ModelAndView("paginas/predio/new");
	}
	
	@RequestMapping("/")
	public ModelAndView findAll(Model model ) {
		List<Predio> predios = predioService.findAll();
		model.addAttribute("predios", predios);
		return new ModelAndView("paginas/predio/list");
	}
}
