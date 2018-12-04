package br.ufg.invscp.service.impl;

import static java.util.Optional.ofNullable;

import java.util.Date;

import br.ufg.invscp.model.BemPatrimonial;
import br.ufg.invscp.model.dto.BaixaBemPatrimonialDTO;
import br.ufg.invscp.model.dto.BemPatrimonialDTO;
import br.ufg.invscp.model.enuns.EnumMotivoBaixa;
import br.ufg.invscp.model.enuns.StatusBemPatrimonialEnum;
import br.ufg.invscp.repository.BemPatrimonialRepository;
import br.ufg.invscp.service.BemPatrimonialService;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BemPatrimonialServiceImpl implements BemPatrimonialService {

  @Autowired
  private BemPatrimonialRepository bemPatrimonialRepository;


  @Override
  public void save(BemPatrimonialDTO dto) {
    BemPatrimonial bemPatrimonial = new BemPatrimonial();

    BeanUtils.copyProperties(dto, bemPatrimonial);

    bemPatrimonialRepository.save(bemPatrimonial);
  }

  @Override
  public void update(Long id, BemPatrimonialDTO dto) {
    BemPatrimonial bemPatrimonial = find(id);

    BeanUtils.copyProperties(dto, bemPatrimonial);

    bemPatrimonialRepository.save(bemPatrimonial);
  }

  @Override
  public List<BemPatrimonial> findAll() {
    return bemPatrimonialRepository.findAllActives();
  }

  @Override
  public BemPatrimonial find(Long bemId) {
    return ofNullable(bemPatrimonialRepository.findOne(bemId))
        .orElseThrow(() -> new EntityNotFoundException("BemPatrimonialNotFound"));
  }

  @Override
  public void delete(Long localizationId) {
    bemPatrimonialRepository.delete(localizationId);
  }
  
  @Override
  public void BaixarBemPatrimonial(Long id, BaixaBemPatrimonialDTO dto) {
	BemPatrimonial bemPatrimonial = find(id);
	bemPatrimonial.setStatus(StatusBemPatrimonialEnum.BAIXA);
	bemPatrimonial.setTipoBaixaEnum(dto.getMotivo());
	bemPatrimonialRepository.save(bemPatrimonial);	
  }
}