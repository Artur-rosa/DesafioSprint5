package br.com.artur.entities;

public class Produto {

	private String nome;

	private String codigo;
	private float preco;

	public Produto(String nome, String codigo, float preco) {

		this.nome = nome;

		this.codigo = codigo;
		this.preco = preco;
	}

	public Produto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
