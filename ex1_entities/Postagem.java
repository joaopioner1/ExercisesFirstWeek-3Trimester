package ex1_entities;

import java.time.LocalDateTime;

public class Postagem {
	
	private final String conteudo;
	private final LocalDateTime dataHora;
	
	public Postagem(String conteudo, LocalDateTime dataHora) {
		this.conteudo = conteudo;
		this.dataHora = dataHora;
	}

	public String getConteudo() {
		return conteudo;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}
}
