package br.ufg.invscp.controller;

import br.ufg.invscp.model.Usuario;
import br.ufg.invscp.model.dto.UsuarioDTO;
import br.ufg.invscp.service.UsuarioService;
import br.ufg.invscp.service.UsuarioService;
import java.util.List;
import org.springframework.beans.BeanUtils;
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
@RequestMapping("usuario")
public class UsuarioController {

  @Autowired
  private UsuarioService usuarioService;

  @PostMapping("/create")
  public ModelAndView save(UsuarioDTO usuario, Model model) {
    usuarioService.save(usuario);
    return findAll(model);
  }

  @RequestMapping("/new")
  public ModelAndView novoUsuario(Model model) {
    model.addAttribute("usuario", new UsuarioDTO());
    return new ModelAndView("paginas/usuario/new");
  }


  @RequestMapping("/edit/{id}")
  public ModelAndView edit(@PathVariable Long id, Model model) {
    Usuario usuario = usuarioService.find(id);

    UsuarioDTO usuarioDTO = new UsuarioDTO();

    BeanUtils.copyProperties(usuario, usuarioDTO);

    model.addAttribute("usuario", usuarioDTO);

    return new ModelAndView("paginas/usuario/edit");
  }

  @PostMapping("/update/{id}")
  public ModelAndView update(@PathVariable Long id, UsuarioDTO usuario, Model model) {
    usuarioService.update(id, usuario);
    return findAll(model);
  }

  @RequestMapping("/delete/{id}")
  public ModelAndView delete(@PathVariable Long id, Model model) {
    usuarioService.delete(id);
    return findAll(model);
  }


  @RequestMapping("/")
  public ModelAndView findAll(Model model) {
    List<Usuario> bens = usuarioService.findAll();
    model.addAttribute("usuarios", bens);
    return new ModelAndView("paginas/usuario/index");
  }
  
}
