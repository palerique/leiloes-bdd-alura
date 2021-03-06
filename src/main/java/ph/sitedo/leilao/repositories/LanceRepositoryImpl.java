package ph.sitedo.leilao.repositories;

import ph.sitedo.leilao.models.Lance;
import br.com.caelum.vraptor.ioc.Component;

import javax.persistence.EntityManager;

@Component
public class LanceRepositoryImpl extends Repository<Lance, Long> implements LanceRepository{

	public LanceRepositoryImpl(EntityManager em) {
		super(em);
	}
	
	@Override
	public void salvar(Lance lance) {
		entityManager.persist(lance);
	}

	@Override
	public Lance porId(Long id) {
		return entityManager.find(Lance.class, id);
	}

}
