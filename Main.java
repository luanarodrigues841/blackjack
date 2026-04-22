import java.util.ArrayList;

public class Main {

    static class Jogador {
        String nome;
        ArrayList<String> mao = new ArrayList<>();

        public Jogador(String nome) {
            this.nome = nome;
        }

        void adicionarCarta(String carta) {
            mao.add(carta);
        }

        void mostrarMao() {
            System.out.println(nome + " tem: " + mao);
        }
    }

    public static void main(String[] args) {

        Jogador jogador = new Jogador("Você");
        Jogador dealer = new Jogador("Dealer");

        jogador.adicionarCarta("A de ♠");
        jogador.adicionarCarta("10 de ♥");
        dealer.adicionarCarta("K de ♦");

        jogador.mostrarMao();
        dealer.mostrarMao();
    }
}