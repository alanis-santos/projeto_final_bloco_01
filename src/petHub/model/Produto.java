package petHub.model;

public abstract class Produto {

	private String nome;
	private String marca;
	private float valor;
	private int tipo;

	public Produto(String nome, String marca, float valor, int tipo) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.tipo = tipo;
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Alimentos";
			break;

		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome produto: " + this.nome);
		System.out.println("Marca produto: " + this.marca);
		System.out.println("Valor produto: " + this.valor);
		System.out.println("Tipo produto: " + tipo);

	}

}
