package br.rs.np.spark.interfaces;

//Contrato de autenticação
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
}
