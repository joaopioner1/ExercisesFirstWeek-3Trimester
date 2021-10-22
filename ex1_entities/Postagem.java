package ex1_entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Postagem {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private final String conteudo;
	private final LocalDateTime dataHora;

	public Postagem(String conteudo) {
		this.conteudo = conteudo;
		this.dataHora = LocalDateTime.now();
	}

	public String getConteudo() {
		return conteudo;
	}

	public String getDataHora() {
		return dataHora.format(formatter);
	}

	@Override
	public String toString() {
		return "POSTAGEM \n" + "Conteudo: " + getConteudo() + "\nData e hora: " + getDataHora() + "\n------------";
	}

}
