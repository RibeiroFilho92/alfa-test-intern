package objetos;

public class Caminhao {

	private String nome;
	private String placa;
	private Integer odometro;
	private String nomeMotorista;
	
	public Caminhao(String nome, String placa, Integer odometro) {
		this.nome = nome;
		this.placa = placa;
		this.odometro = odometro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getOdometro() {
		return odometro;
	}

	public void addOdometro(Integer valor) {
		this.odometro += valor;
	}

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

}
