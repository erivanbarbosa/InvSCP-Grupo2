package br.ufg.invscp.service;

import br.ufg.invscp.model.BemPatrimonial;
import br.ufg.invscp.model.dto.BaixaBemPatrimonialDTO;
import br.ufg.invscp.model.dto.BemPatrimonialDTO;
import br.ufg.invscp.model.enuns.EnumMotivoBaixa;

import java.util.Date;
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

	void BaixarBemPatrimonial(Long id, BaixaBemPatrimonialDTO dto);
}
