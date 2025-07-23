package telefone;

import telefone.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        //ReprodutorMusical
        System.out.println("=== Reprodutor Musical ===");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("In the End - Linkin Park");

        //AparelhoTelefonico
        System.out.println("\n=== Aparelho Telefônico ===");
        meuIphone.ligar("34 9 99999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // NavegadorInternet
        System.out.println("\n=== Navegador da Internet ===");
        meuIphone.exibirPagina("https://www.santander.com.br");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();


        //Executar java telefone.App

    }
}
