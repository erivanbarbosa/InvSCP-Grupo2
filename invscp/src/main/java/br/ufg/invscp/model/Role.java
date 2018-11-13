package br.ufg.invscp.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Entity
@Table(name = "role")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;


  @Column(name = "name")
  private String name;

  public Role() {
    // TODO Auto-generated constructor stub
  }

  public Role(String name) {
    super();
    this.name = name;
  }

  @ManyToMany(mappedBy = "roles")
  private Set<Usuario> users;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Usuario> getUsers() {
    return users;
  }

  public void setUsers(Set<Usuario> users) {
    this.users = users;
  }

}
