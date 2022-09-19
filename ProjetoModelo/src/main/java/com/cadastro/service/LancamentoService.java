package com.cadastro.service;

import java.util.List;

import com.cadastro.model.entity.Lancamento;
import com.cadastro.model.enums.StatusLancamento;

public interface LancamentoService {

	Lancamento salvar(Lancamento lancamento);
	
	Lancamento atualizar(Lancamento lancamento);
	
	void deletar(Lancamento lancamento);
	
	List<Lancamento> buscar(Lancamento lancamento);
	
	void atualizarStatus(Lancamento lancamento, StatusLancamento status);
	
	void validar(Lancamento lancamento);
}
