package br.ufg.invscp.service;

import br.ufg.invscp.model.BemPatrimonial;
import br.ufg.invscp.model.dto.BemPatrimonialDTO;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Service
public interface BemPatrimonialService {

  public void update(Long id, BemPatrimonialDTO bem);

  public void delete(Long id);

  public List<BemPatrimonial> findAll();

  public BemPatrimonial find(Long id);

  public void save(BemPatrimonialDTO location);
}
