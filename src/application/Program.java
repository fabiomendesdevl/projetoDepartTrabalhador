package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.TrabalhoLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Insira o nome do departamento: ");
		String departamentoNome = sc.nextLine();
		System.out.println("Insira o nome do trabalhador: ");
		String nome = sc.nextLine();
		System.out.print("Insira o level: ");
		String level = sc.nextLine();
		System.out.print("Salario base: ");
		double salarioBase = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome, TrabalhoLevel.valueOf(level), salarioBase, new Departamento(departamentoNome));

		System.out.print("Quantos contratos para esse trabalhado: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Insira o contrato #: " + i);
			System.out.print("Insira a data (DD//MM/AA): ");
			Date contratoData = sdf.parse(sc.next());
			System.out.print("Insira o valor por hora $ ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração do contrato (horas) : ");
			int hora = sc.nextInt();
			HoraContrato contrato = new HoraContrato(contratoData, valorPorHora, hora);
			trabalhador.AddContrato(contrato);
		}
		System.out.println();
		System.out.print("Insira o mes e ano para calcular o salario: (MM/AAAA)");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));

		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		// Composiçao de obj > tenho obj trabalhador que acessa outro que esta associado
		// a ele getDepartamento e depois associa o nome
		System.out.println("Calculo: " + mesEAno + ": " + String.format("%.2f", trabalhador.calculo(ano, mes)));

		sc.close();
	}

}
