package petHub.model;

public class Alimentos extends Produto {
	
	private String sabor;
	private float pesagem;
	
	public Alimentos (String nome, String marca, float valor, String sabor, float pesagem) {
		super( nome, marca, valor);
		this.setSabor(sabor);
		this.setPesagem(pesagem);
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public float getPesagem() {
		return pesagem;
	}

	public void setPesagem(float pesagem) {
		this.pesagem = pesagem;
	}
     
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Sabor do produto: " + this.sabor);
		System.out.println("Peso do produto: " + this.pesagem);
	}
		
	
}
