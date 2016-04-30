package br.com.barrabinbarrabash.entity;

import java.util.List;

public class Editora extends Fornecedor {
	
	private String nome;
	private String contato;
	private Fornecedor fornecedor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List listarLivros() {
		return null;
	}

	public List listarAutores() {
		return null;
	}


}
