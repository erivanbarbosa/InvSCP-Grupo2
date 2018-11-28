package br.ufg.invscp.controller;

import br.ufg.invscp.model.BemPatrimonial;
import br.ufg.invscp.model.Localization;
import br.ufg.invscp.model.dto.BemPatrimonialDTO;
import br.ufg.invscp.service.BemPatrimonialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Controller
@RequestMapping("bem")
public class BemPatrimonialController {

  @Autowired
  private BemPatrimonialService bemPatrimonialService;

  @PostMapping("/create")
  public ModelAndView save(BemPatrimonialDTO location, Model model) {
    bemPatrimonialService.save(location);
    return findAll(model);
  }

  @RequestMapping("/new")
  public ModelAndView novoBemPatrimonial(Model model) {
    model.addAttribute("bem", new Localization());
    return new ModelAndView("paginas/bem/new");
  }


  @RequestMapping("/edit/{id}")
  public ModelAndView edit(@PathVariable Long id, Model model) {
    BemPatrimonial bem = bemPatrimonialService.find(id);
    System.out.println(bem);
    model.addAttribute("bem", bem);
    return new ModelAndView("paginas/bem/edit");
  }

  @PostMapping("/update/{id}")
  public ModelAndView update(@PathVariable Long id, BemPatrimonialDTO bem, Model model) {
    bemPatrimonialService.update(id, bem);
    return findAll(model);
  }

  @RequestMapping("/delete/{id}")
  public ModelAndView delete(@PathVariable Long id, Model model) {
    bemPatrimonialService.delete(id);
    return findAll(model);
  }



  @RequestMapping("/")
  public ModelAndView findAll(Model model ) {
    List<BemPatrimonial> bens = bemPatrimonialService.findAll();
    model.addAttribute("bens", bens);
    return new ModelAndView("paginas/bem/index");
  }

}
