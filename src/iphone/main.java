package iphone;

public class main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		//Telefone
		iphone.fazerLigacao();
		iphone.atenderLigacao();
		iphone.iniciarCorreioVoz();
		
		//Musica
		iphone.selecionarMusica();
		iphone.tocarMusica();
		iphone.pausarMusica();
		
		//Internet
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
	}

}
