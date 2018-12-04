package br.ufg.invscp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufg.invscp.model.Departamento;
import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.Predio;
import br.ufg.invscp.model.Sala;
import br.ufg.invscp.model.dto.DepartamentoDTO;
import br.ufg.invscp.model.dto.LocalizationDTO;
import br.ufg.invscp.model.dto.PredioDTO;
import br.ufg.invscp.model.dto.SalaDTO;
import br.ufg.invscp.repository.UsuarioRepository;
import br.ufg.invscp.service.DepartamentoService;
import br.ufg.invscp.service.LocalizationService;
import br.ufg.invscp.service.PredioService;
import br.ufg.invscp.service.SalaService;

@Controller
@RequestMapping("departamento")
public class DepartamentoController {
	
	@Autowired
	private LocalizationService localizationService;
	
	@Autowired 
	private PredioService predioService;
	
	@Autowired
	private SalaService salaService;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/create")
	public ModelAndView save(DepartamentoDTO dto, Model model) {
		departamentoService.save(dto);
		return findAll(model);
	}
	
	@RequestMapping("/new")
	public ModelAndView novoDepartamento(Model model) {
		model.addAttribute("departamento", new DepartamentoDTO());
		model.addAttribute("usuarios", usuarioRepository.findAll());
		return new ModelAndView("paginas/departamento/departamento-new");
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editPredio(@PathVariable Long id, Model model) {
		DepartamentoDTO departamento = departamentoService.findDTO(id);
		model.addAttribute("departamento", departamento);
		model.addAttribute("usuarios", usuarioRepository.findAll());
		return new ModelAndView("paginas/departamento/departamento-edit");
	}
	
	@PostMapping("/update/{id}")
	public ModelAndView update(@PathVariable Long id, DepartamentoDTO dto, Model model) {
		departamentoService.update(id, dto);
		return findAll(model);
	}
	
	@RequestMapping("/")
	public ModelAndView findAll(Model model ) {
		List<Departamento> departamentos = departamentoService.findAll();
		model.addAttribute("departamentos", departamentos);
		return new ModelAndView("paginas/departamento/departamento-list");
	}
}
