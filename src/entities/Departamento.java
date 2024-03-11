package entities;

public class Departamento {
	
	private String departamentoNome;
	
	public Departamento() {
		
	}

	public Departamento(String departamentoNome) {
		this.departamentoNome = departamentoNome;
	}

	public String getNome() {
		return departamentoNome;
	}

	public void setNome(String departamentoNome) {
		this.departamentoNome = departamentoNome;
	}
	
}
