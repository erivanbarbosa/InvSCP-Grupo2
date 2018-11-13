package br.ufg.invscp.repository;

import br.ufg.invscp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Iago Bruno
 * @since 1.0
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

  public Usuario findByUsername(String username);

}
