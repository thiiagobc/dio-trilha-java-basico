package telefone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        // Métodos do ReprodutorMusical

        public void tocar() {
            System.out.println("Tocando música no iPhone...");
        }

        public void pausar() {
            System.out.println("Pausando música no iPhone...");
        }

        public void selecionarMusica(String musica) {
            System.out.println("Selecionando a música: " + musica);
        }

        // Métodos do AparelhoTelefonico

        public void ligar(String numero) {
            System.out.println("Ligando para: " + numero);
        }

        public void atender() {
            System.out.println("Atendendo ligação...");
        }

        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz...");
        }

        // Métodos do NavegadorInternet

        public void exibirPagina(String url) {
            System.out.println("Exibindo a página: " + url);
        }

        public void adicionarNovaAba() {
            System.out.println("Adicionando nova aba no navegador...");
        }

        public void atualizarPagina() {
            System.out.println("Atualizando a página do navegador...");
        }
    }