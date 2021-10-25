package ex2_entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Estudante {
	
	private final String nome;
	private final LocalDate dataNasc;
	
	public final ArrayList<Double> lista_notas = new ArrayList<>();

	public Estudante(String nome, LocalDate dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public int getIdade() {
		return LocalDate.now().getYear() - dataNasc.getYear();
	}
	
	public void insereNota(double nota) {
		lista_notas.add(nota);
	}
	
	public Double calculaMedia() {
		double aux = 0;
		for (Double d : lista_notas) {
			aux += d;
		}
		return aux / lista_notas.size();
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", dataNasc=" + dataNasc + ", lista_notas=" + lista_notas + "]";
	}
	
}
