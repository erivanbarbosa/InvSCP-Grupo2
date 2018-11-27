package br.ufg.invscp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.dto.LocalizationDTO;
import br.ufg.invscp.service.LocalizationService;

@Controller
@RequestMapping("localizacao")
public class LocalizacaoController {
	
	@Autowired
	private LocalizationService localizationService;
	
	@PostMapping("/create")
	public ModelAndView save(LocalizationDTO  location, Model model) {
		localizationService.save(location);
		return findAll(model);
	}
	
	@RequestMapping("/new")
	public ModelAndView novaLocalizacao(Model model) {
		model.addAttribute("localizacao", new Localization());
		return new ModelAndView("paginas/localizacao/new");
	}


	@RequestMapping("/edit/{id}")
	public ModelAndView editLocalizacao(@PathVariable Long id, Model model) {
		Localization localization = localizationService.findLocalization(id);
		System.out.println(localization);
		model.addAttribute("localizacao", localization);
		return new ModelAndView("paginas/localizacao/edit");
	}
	
	@PostMapping("/update/{id}")
	public ModelAndView update(@PathVariable Long id, LocalizationDTO  location, Model model) {
		localizationService.update(id, location);
		return findAll(model);
	}
	
	
	
	@RequestMapping("/")
	public ModelAndView findAll(Model model ) {
		List<Localization> localizations = localizationService.findAllLocalizations();
		model.addAttribute("localizacoes", localizations);
		return new ModelAndView("paginas/localizacao/index");
	}
}
