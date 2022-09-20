package com.cadastro.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ErroAutenticacao;
import com.cadastro.exception.RegraNegocioException;
import com.cadastro.model.entity.Usuario;
import com.cadastro.repository.UsuarioRepository;
import com.cadastro.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public Usuario autenticar(String email, String senha) {
		Optional<Usuario> usuario = repository.findByEmail(email);

		if (!usuario.isPresent()) {
			throw new ErroAutenticacao("Usuário não encontrado.");
		}

		if (!usuario.get().getSenha().equals(senha)) {
			throw new ErroAutenticacao("senha inválida.");
		}

		return usuario.get();
	}

	@Override
	@Transactional
	public Usuario salvarUsuario(Usuario usuario) {
		validarEmail(usuario.getEmail());
		return repository.save(usuario);
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if (existe) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com este email.");
		}
	}
	
	@Override
	public Optional<Usuario> obterPorId(Long id){
		return repository.findById(id);
	}
}
