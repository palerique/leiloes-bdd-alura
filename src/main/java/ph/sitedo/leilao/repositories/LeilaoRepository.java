package ph.sitedo.leilao.repositories;

import java.util.List;

import ph.sitedo.leilao.models.Leilao;

public interface LeilaoRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Leilao entity);
	
	Leilao update(Leilao entity);
	
	void destroy(Leilao entity);
	
	Leilao find(Long id);
	
	List<Leilao> findAll();

}
