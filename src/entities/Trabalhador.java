package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.TrabalhoLevel;

public class Trabalhador {

	private String nome;
	private TrabalhoLevel level;
	private Double salario;

	private Departamento departamento;
	private List<HoraContrato> contrato = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, TrabalhoLevel level, Double salario, Departamento departamentos) {
		this.nome = nome;
		this.level = level;
		this.salario = salario;
		this.departamento = departamentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TrabalhoLevel getLevel() {
		return level;
	}

	public void setLevel(TrabalhoLevel level) {
		this.level = level;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContrato() {
		return contrato;
	}

	public void setContrato(List<HoraContrato> contrato) {
		this.contrato = contrato;
	}

	public void AddContrato(HoraContrato contratos) { // prestar atenção
		contrato.add(contratos);
	}

	public void RemoveContrato(HoraContrato contratos) {
		contrato.remove(contratos);
	}

	public double calculo(int ano, int mes) {
		double soma = salario;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contrato) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma = soma + c.valorTotal();
			}
		}
		return soma;
	}
}
