package br.ufg.invscp.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import br.ufg.invscp.model.Usuario;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioRepositoryTest {

  @Autowired
  private UsuarioRepository repository;

  private Usuario usuarioSalvo;

  @Before
  public void testeSaveUsuario() {
    Usuario usuario = new Usuario();

    usuario.setNome("Teste");
    usuario.setPassword("123456");
    usuario.setUsername("teste");

    usuarioSalvo = repository.save(usuario);

    assertNotNull(usuarioSalvo);
  }

  @Test
  public void testeFindUsername() {
    Usuario byUsername = repository.findByUsername(usuarioSalvo.getUsername());
    assertEquals(byUsername, usuarioSalvo);
  }


}
