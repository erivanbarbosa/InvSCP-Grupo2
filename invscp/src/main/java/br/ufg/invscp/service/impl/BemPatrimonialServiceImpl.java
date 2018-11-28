package br.ufg.invscp.service.impl;

import static java.util.Optional.ofNullable;

import br.ufg.invscp.model.BemPatrimonial;
import br.ufg.invscp.model.dto.BemPatrimonialDTO;
import br.ufg.invscp.repository.BemPatrimonialRepository;
import br.ufg.invscp.service.BemPatrimonialService;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BemPatrimonialServiceImpl implements BemPatrimonialService {

  @Autowired
  private BemPatrimonialRepository bemPatrimonialRepository;

  @Override
  public void save(BemPatrimonialDTO dto) {
    BemPatrimonial bemPatrimonial = new BemPatrimonial();
    bemPatrimonialRepository.save(bemPatrimonial);
  }

  @Override
  public void update(Long id, BemPatrimonialDTO dto) {
    BemPatrimonial bemPatrimonial = find(id);
    bemPatrimonialRepository.save(bemPatrimonial);
  }

  @Override
  public List<BemPatrimonial> findAll() {
    return bemPatrimonialRepository.findAll();
  }

  @Override
  public BemPatrimonial find(Long localizationId) {
    return ofNullable(bemPatrimonialRepository.findOne(localizationId))
        .orElseThrow(() -> new EntityNotFoundException("BemPatrimonialNotFound"));
  }

  @Override
  public void delete(Long localizationId) {
    bemPatrimonialRepository.delete(localizationId);
  }
}