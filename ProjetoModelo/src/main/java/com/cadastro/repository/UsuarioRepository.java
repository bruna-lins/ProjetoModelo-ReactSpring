package com.cadastro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.model.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	//query methods: o spring entende que o padrão "findBy<Nome da Variavel>" gera certo comando sql e faz automaticamente
	//Optional<Usuario> findByEmail(String email);
	
	//forma acima é a tradicional, a usada é a forma simplificada apenas para saber se existe ou nao
	boolean existsByEmail(String email);
	
	Optional<Usuario> findByEmail(String email);
}
