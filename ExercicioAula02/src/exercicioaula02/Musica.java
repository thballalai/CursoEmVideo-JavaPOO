// Criação da classe Musica, para referenciar um objeto abstrato.

package exercicioaula02;

public class Musica {
    String nome;
    String banda;
    String produtora;
    String album;
    String genero;
    int duracao;
    boolean estaTocando;
    
    void play(){
        this.estaTocando = true;
    }
    
    void pause(){
        this.estaTocando = false;
    }
}
