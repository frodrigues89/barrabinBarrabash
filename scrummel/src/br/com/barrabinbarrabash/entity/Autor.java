package br.com.barrabinbarrabash.entity;

import java.util.Date;
import java.util.List;

public class Autor {
	
	private String localNascimento;
	private String localFalecimento;
	private Date dataFalecimento;
	private Categoria categoria;

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}

	public String getLocalFalecimento() {
		return localFalecimento;
	}

	public void setLocalFalecimento(String localFalecimento) {
		this.localFalecimento = localFalecimento;
	}

	public Date getDataFalecimento() {
		return dataFalecimento;
	}

	public void setDataFalecimento(Date dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List listarObras() {
		return null;
	}

	public Livro verificarLancamentos() {
		return null;
	}

}
