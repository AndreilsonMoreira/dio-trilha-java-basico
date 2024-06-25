package iphone;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{


	//ReprodutorMusical
	public void tocarMusica() {		
		System.out.println("Todando musica");
	}

	public void pausarMusica() {		
		System.out.println("Musica pausada");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
	}

	
	//AparelhoTelefonico
	public void fazerLigacao() {		
		System.out.println("Ligando");
	}
	
	public void atenderLigacao() {		
		System.out.println("Ligacao atendida");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
	}
	

	//NavegadorInternet
	public void exibirPagina() {
		System.out.println("Pagina exibida");
	}
	
	public void adicionarNovaAba() {		
		System.out.println("Nova aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");		
	}

}
