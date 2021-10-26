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
	
	
}
