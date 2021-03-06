package ex3_entities;

import java.util.ArrayList;

public class Serie {
	
	private final String titulo;
	private int nota;
	
	private final ArrayList<Temporada> list_temps;
	
	public Serie(String titulo) {
		this.titulo = titulo;
		this.nota = 0;
		this.list_temps = new ArrayList<>();
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNota() {
		return nota;
	}

	public boolean isAvaliado() {
		if (this.nota <= 5 && this.nota > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public Temporada getTemporada(int index) {
		return list_temps.get(index-1);
	}
	
	public ArrayList<Temporada> getTemporadas() {
		return this.list_temps;
	}

	public boolean isAssistido() {
		int count = 0;
		for (Temporada t : list_temps) {
			if (t.isAssistido() == true) {
				count++;
			} 
		}
		if (count == list_temps.size()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void assistirProximo() {
		for (int i = 0; i < list_temps.size(); i++) {
			if (list_temps.get(i).getEpisodio(i).isAssistido() == false) {
				list_temps.get(i).getEpisodio(i).assistir();
				break;
			}
		}
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", nota=" + nota + ", list_temps=" + list_temps + "]";
	}
}
