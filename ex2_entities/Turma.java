package ex2_entities;

import java.util.ArrayList;

public class Turma {

	private final String nome;
	private final int ano;
	private final String curso;

	private ArrayList<Estudante> list_estudantes;

	public Turma(String nome, int ano, String curso) {
		this.ano = ano;
		this.nome = nome;
		this.curso = curso;
		list_estudantes = new ArrayList<>();
	}

	public ArrayList<Estudante> getEstudantes() {
		return list_estudantes;
	}

	public String getNome() {
		return nome;
	}

	public int getAno() {
		return ano;
	}

	public String getCurso() {
		return curso;
	}

	public Double mediaTurma() {
		double avg = 0;
		for (Estudante e : list_estudantes) {
			avg += e.calculaMedia();
		}
		return avg / list_estudantes.size();
	}
	
	public void addEstudante(Estudante e) {
		
	}
}
