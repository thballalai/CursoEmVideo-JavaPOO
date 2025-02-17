// Criação da classe Quadro, para referenciar um objeto tangivel.

package exercicioaula02;

public class Quadro {
    String nome;
    String pintor;
    String tecnica;
    boolean moldura;
    boolean pendurada;
    int altura;
    int comprimento;
    int area;
    int ano;
    float valor;

    void emoldurar(){
        this.moldura = moldura != true;
    }
    
    void pendurar(){
        this.pendurada = pendurada != true;
    }

}