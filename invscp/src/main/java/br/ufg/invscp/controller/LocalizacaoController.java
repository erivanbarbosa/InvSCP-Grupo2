package br.ufg.invscp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
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
		return find(model);
	}
	
	@RequestMapping("/new")
	public ModelAndView novaLocalizacao(Model model) {
		model.addAttribute("localizacao", new Localization());
		return new ModelAndView("paginas/localizacao/new");
	}
	
	@RequestMapping("/")
	public ModelAndView find(Model model ) {
		List<Localization> localizations = localizationService.findAllLocalizations();
		model.addAttribute("localizacoes", localizations);
		return new ModelAndView("paginas/localizacao/index");
	}
}
