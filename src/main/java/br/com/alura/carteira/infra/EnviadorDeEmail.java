package br.com.alura.carteira.infra;

public interface EnviadorDeEmail {

	void enviarEmail(String destinatario, String assunto, String mensagem);

}