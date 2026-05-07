package petHub.model;

public class Produto {

	private String nome;
	private String marca;
	private float valor;

	public Produto(String nome, String marca, float valor) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome produto: " + this.nome);
		System.out.println("Marca produto: " + this.marca);
		System.out.println("Valor produto: " + this.valor);
		
	}

}
