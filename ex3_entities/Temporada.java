package ex3_entities;

import java.time.Duration;
import java.util.ArrayList;

public class Temporada {

	private final String titulo;
	private final ArrayList<Episodio> list_eps;

	public Temporada(String titulo) {
		this.titulo = titulo;
		this.list_eps = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void addEpisodio(String titulo, Duration d) {
		list_eps.add(new Episodio(titulo, d));
	}

	public Episodio getEpisodio(int pos) {
		return list_eps.get(pos);
	}

	public void assistirProximo() {
		for (int i = 0; i < list_eps.size(); i++) {
			if (list_eps.get(i).isAssistido() == false) {
				list_eps.get(i).assistir();
				break;
			}
		}
	}

	public boolean isAssistido() {
		int count = 0;
		for (Episodio e : list_eps) {
			if (e.isAssistido() == true) {
				count++;
			} 
		}
		if (count == list_eps.size()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getTamanho() {
		return list_eps.size();
	}

	@Override
	public String toString() {
		return "Temporada [titulo=" + titulo + ", list_eps=" + list_eps + "]";
	}
	
	
}
