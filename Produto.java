package crudProduto;

public class Produto {

	private int id;
	private String nome;
	private float valor;
	
	public Produto(int id, String nome, float valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return this.nome;
	}
	public float getValor() {
		return this.valor;
	}
	public int getId() {
		return this.id;
	}
}
