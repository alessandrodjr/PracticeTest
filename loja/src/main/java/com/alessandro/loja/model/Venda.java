package com.alessandro.loja.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_vendas") 
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nomeCliente;
	
	private LocalDate dataVenda = LocalDate.now();
	
	@OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("venda")
	private List<ItemVenda>itemVenda;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public List<ItemVenda> getItemVenda() {
		return itemVenda;
	}

	public void setItemVenda(List<ItemVenda> itemVenda) {
		this.itemVenda = itemVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}
	
}
