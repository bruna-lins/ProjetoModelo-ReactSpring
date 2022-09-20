package com.cadastro.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.cadastro.model.enums.StatusLancamento;
import com.cadastro.model.enums.TipoLancamento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lancamento")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lancamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column
	private Integer mes;

	@Column
	private Integer ano;

	/*
	 * Forma mais usada quando há chaves estrangeiras;
	 * Não tem diferença para Column, apenas indica que é de relacionamento Por ser
	 * um relacionamento, precisa indicar o tipo desse relacionamento O Many
	 * (primeira posição) faz referencia a entidade atual (lancamentos) E o One
	 * (segunda posição) faz referencia a entidade que está sendo referenciada
	 * (usuario);
	 */
	@JoinColumn(name = "id_usuario")
	@ManyToOne
	private Usuario usuario;
	
	@Column
	private String descricao;
	
	@Column
	private BigDecimal valor;
	
	@Column(name = "data_cadastro")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate dataCadastro;
	
	@Column(name = "tipo")
	@Enumerated(value = EnumType.STRING)
	private TipoLancamento tipo;
	
	@Column(name = "stats")
	@Enumerated(value = EnumType.STRING)
	private StatusLancamento status;

}
