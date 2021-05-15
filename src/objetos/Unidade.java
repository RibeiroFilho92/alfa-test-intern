package objetos;

public class Unidade {

	private String nome;
	private String fiscal;
	
	public Unidade(String nome, String fiscal) {
		this.nome = nome;
		this.fiscal = fiscal;
	}

	public String getFiscal() {
		return fiscal;
	}

	public void setFiscal(String fiscal) {
		this.fiscal = fiscal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
