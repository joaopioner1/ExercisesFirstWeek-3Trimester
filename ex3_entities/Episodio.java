package ex3_entities;

import java.time.Duration;

public class Episodio {
	
	private final String titulo;
	private final Duration duracao;
	private boolean assistido;

	public Episodio(String titulo, Duration duracao) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.assistido = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public Duration getDuracao() {
		return duracao;
	}

	public boolean isAssistido() {
		return assistido;
	}
	
	public boolean assistir() {
		return assistido = true;
	}
}
