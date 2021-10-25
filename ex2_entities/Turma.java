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
		this.list_estudantes.add(e);
	}

	public Estudante getEstudante(int pos) {
		return this.list_estudantes.get(pos);
	}

	public int totalAprovados(int media) {
		ArrayList<Estudante> aprovados = new ArrayList<>();
		for (int i = 0; i < list_estudantes.size(); i++) {
			if (list_estudantes.get(i).calculaMedia() >= media) {
				aprovados.add(list_estudantes.get(i));
			}
		}
		return aprovados.size();
	}
	
	public int totalReprovados(int media) {
		ArrayList<Estudante> reprovados = new ArrayList<>();
		for (int i = 0; i < list_estudantes.size(); i++) {
			if (list_estudantes.get(i).calculaMedia() < media) {
				reprovados.add(list_estudantes.get(i));
			}
		}
		return reprovados.size();
	}

	@Override
	public String toString() {
		return "Turma [nome=" + nome + ", ano=" + ano + ", curso=" + curso + ", list_estudantes=" + list_estudantes
				+ "]";
	}
}
