package entidades;

public class Quarto {

	private String nomeCliente;
	private String emailCliente;
	
	public Quarto(String nomeCliente, String emailCliente) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getEmailCliente() {
		return emailCliente;
	}
	
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	@Override
	public String toString() {
		return "Alugado por: "+nomeCliente+" que é dono(a) do e-mail: "+ emailCliente;
	}
	
}
