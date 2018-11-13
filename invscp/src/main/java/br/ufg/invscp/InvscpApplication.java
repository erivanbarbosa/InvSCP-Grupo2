package br.ufg.invscp;

import br.ufg.invscp.model.Role;
import br.ufg.invscp.model.Usuario;
import br.ufg.invscp.repository.UsuarioRepository;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class InvscpApplication {

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  public static void main(String[] args) {
    SpringApplication.run(InvscpApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(UsuarioRepository userRepository) {

    Set<Role> roles = new HashSet<Role>();

    roles.add(new Role("ADMIN"));

    Usuario admin = new Usuario("administrador", bCryptPasswordEncoder.encode("123456"),
        "admin@invscp.com.br", roles);

    return args -> {
      userRepository.save(admin);
    };
  }

  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }


}
