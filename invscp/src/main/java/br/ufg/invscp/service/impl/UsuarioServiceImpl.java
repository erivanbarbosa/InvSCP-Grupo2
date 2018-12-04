package br.ufg.invscp.service.impl;

import static java.util.Optional.ofNullable;

import br.ufg.invscp.model.Role;
import br.ufg.invscp.model.Usuario;
import br.ufg.invscp.model.dto.UsuarioDTO;
import br.ufg.invscp.repository.RoleRepository;
import br.ufg.invscp.repository.UsuarioRepository;
import br.ufg.invscp.service.UsuarioService;
import java.util.HashSet;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {


  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private RoleRepository roleRepository;

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Override
  public void save(UsuarioDTO usuario) {

    Usuario usuarioEntidade = new Usuario();

    usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));

    BeanUtils.copyProperties(usuario, usuarioEntidade);

    usuarioEntidade.setRoles(new HashSet<Role>(roleRepository.findAll()));

    usuarioRepository.save(usuarioEntidade);

  }

  @Override
  public Usuario find(Long id) {
    return ofNullable(usuarioRepository.findOne(id))
        .orElseThrow(() -> new EntityNotFoundException("UsuarioNotFound"));
  }

  @Override
  public void update(Long id, UsuarioDTO usuario) {
    Usuario usuarioEntidade = find(id);

    usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));

    BeanUtils.copyProperties(usuario, usuarioEntidade);

    usuarioRepository.save(usuarioEntidade);
  }

  @Override
  public void delete(Long id) {
    usuarioRepository.delete(id);
  }

  @Override
  public List<Usuario> findAll() {
    return usuarioRepository.findAll();
  }
}
