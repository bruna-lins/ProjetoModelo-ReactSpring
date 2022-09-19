package com.cadastro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.model.entity.Lancamento;
import com.cadastro.repository.LancamentoRepository;
import com.cadastro.service.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {

	@Autowired
	private LancamentoRepository repository;
	
	@Override
	public Lancamento salvar(Lancamento lancamento) {
		
		return null;
	}

	@Override
	public Lancamento atualizar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Lancamento> buscar(Lancamento lancamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarStatus(Lancamento lancamento) {
		// TODO Auto-generated method stub
		
	}

}
