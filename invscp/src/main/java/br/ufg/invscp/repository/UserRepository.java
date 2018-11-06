package br.ufg.invscp.repository;

import br.ufg.invscp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Iago Bruno
 * @since 1.0
 */
public interface UserRepository extends JpaRepository<User, Long> {

  public User findByUsername(String username);
  
}
