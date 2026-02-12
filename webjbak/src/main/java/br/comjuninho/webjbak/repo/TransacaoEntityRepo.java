package br.comjuninho.webjbak.repo;

import org.springframework.data.repository.CrudRepository;

import br.comjuninho.webjbak.entity.TransacaoEntity;

public interface TransacaoEntityRepo extends CrudRepository <TransacaoEntity, String>{

}
