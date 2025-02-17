// Criação da classe Perfume, para referenciar um objeto tangivel.

package exercicioaula02;

public class Perfume {
    String nome;
    String colonia;
    String marca;
    int volumeTotal;
    int volumeAtual;
    float valor;
    boolean usado;
    
    int quantoUsou(){
        if(this.volumeAtual==this.volumeTotal){
            this.usado = false;
            return 0;
        } else {
            this.usado = true;
            return this.volumeTotal = this.volumeAtual;
        }
    }
}
