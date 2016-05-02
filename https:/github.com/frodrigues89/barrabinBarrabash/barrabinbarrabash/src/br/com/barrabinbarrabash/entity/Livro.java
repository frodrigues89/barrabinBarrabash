package br.com.barrabinbarrabash.entity;

import java.util.Calendar;
import java.util.List;

public class Livro extends Editora {
	
	private int isbn;
	private int quantidadeEmEstoque;
	private String nome;
	private Autor autores;
	private Editora editora;
	private Calendar dataLancamento;
	private int numPaginas;
	private Categoria categoria;
	private String resumo;
	private double precoCompra;
	private String formatoCapa;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Autor getAutores() {
		return autores;
	}

	public void setAutores(Autor autores) {
		this.autores = autores;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public String getFormatoCapa() {
		return formatoCapa;
	}

	public void setFormatoCapa(String formatoCapa) {
		this.formatoCapa = formatoCapa;
	}

	public double calcularPrecoVenda() {
		return 0;
	}

	public List livrosVendidos() {
		return null;
	}


}
