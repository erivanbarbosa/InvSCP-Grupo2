package br.ufg.invscp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.Predio;
import br.ufg.invscp.model.Sala;
import br.ufg.invscp.model.dto.LocalizationDTO;
import br.ufg.invscp.model.dto.PredioDTO;
import br.ufg.invscp.model.dto.SalaDTO;
import br.ufg.invscp.service.DepartamentoService;
import br.ufg.invscp.service.LocalizationService;
import br.ufg.invscp.service.PredioService;
import br.ufg.invscp.service.SalaService;

@Controller
@RequestMapping("sala")
public class SalaController {
	
	@Autowired
	private LocalizationService localizationService;
	
	@Autowired 
	private PredioService predioService;
	
	@Autowired
	private SalaService salaService;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@PostMapping("/create")
	public ModelAndView save(SalaDTO  dto, Model model) {
		salaService.save(dto);
		return findAll(model);
	}
	
	@RequestMapping("/new")
	public ModelAndView novaSala(Model model) {
		model.addAttribute("sala", new SalaDTO());
		model.addAttribute("predios", predioService.findAll());
		model.addAttribute("departamentos", departamentoService.findAll());
		return new ModelAndView("paginas/sala/sala-new");
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editPredio(@PathVariable Long id, Model model) {
		Sala sala = salaService.find(id);
		model.addAttribute("sala", sala);
		model.addAttribute("predios", predioService.findAll());
		model.addAttribute("departamentos", departamentoService.findAll());
		return new ModelAndView("paginas/sala/sala-edit");
	}
	
	@PostMapping("/update/{id}")
	public ModelAndView update(@PathVariable Long id, SalaDTO dto, Model model) {
		salaService.update(id, dto);
		return findAll(model);
	}
	
	@RequestMapping("/")
	public ModelAndView findAll(Model model ) {
		List<Sala> salas = salaService.findAll();
		model.addAttribute("predios", salas);
		return new ModelAndView("paginas/sala/sala-list");
	}
}
