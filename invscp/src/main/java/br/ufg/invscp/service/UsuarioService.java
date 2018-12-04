package br.ufg.invscp.service;

import br.ufg.invscp.model.Usuario;
import br.ufg.invscp.model.dto.UsuarioDTO;
import java.util.List;

/**
 * @author Iago Bruno
 * @since 1.0
 */
public interface UsuarioService {

  void save(UsuarioDTO usuario);

  Usuario find(Long id);

  void update(Long id, UsuarioDTO usuario);

  void delete(Long id);

  List<Usuario> findAll();
}
