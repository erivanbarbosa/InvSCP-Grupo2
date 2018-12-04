package br.ufg.invscp.servico;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import br.ufg.invscp.model.Usuario;
import br.ufg.invscp.model.dto.UsuarioDTO;
import br.ufg.invscp.service.UsuarioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioServiceTest {


  @Autowired
  private UsuarioService usuarioService;


  @Test
  public void testeSaveUsuario() {
    UsuarioDTO usuario = new UsuarioDTO();

    usuario.setNome("Novo");
    usuario.setPassword("123456");
    usuario.setUsername("teste");

    usuarioService.save(usuario);

    Usuario usuarioSalvo = usuarioService.findAll().get(0);

    assertNotNull(usuarioSalvo);

  }


}
