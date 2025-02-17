/*
Neste exercicio foi solicitado a criação de 4 classes. Cada classe contendo
atributos e metodos de 2 objetos tangiveis e 2 objetos abstratos.
*/

package exercicioaula02;

import java.util.Scanner;

public class ExercicioAula02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Criação do primeiro objeto utilizando a classe Quadro, manipulando 
        atributos e metodos desta classe. */
        Quadro q1 = new Quadro();
        q1.moldura = true;
        q1.emoldurar();
        System.out.println(q1.moldura);
        
        /*Criação do segundo objeto utilizando a classe Perfume, manipulando 
        atributos e metodos desta classe. */
        
        Perfume p1 = new Perfume();
        p1.volumeTotal = 120;
        p1.volumeAtual = p1.volumeTotal;
        int uso = p1.quantoUsou();
        System.out.println(uso);
        System.out.println(p1.usado);
        
        /*Criação do terceiro objeto utilizando a classe Musica, manipulando 
        atributos e metodos desta classe. */
        Musica boateAzul = new Musica();
        boateAzul.nome = "Boate Azul";
        boateAzul.banda = "Bruno & Marrone";
        boateAzul.duracao = 199;
        boateAzul.play();
        
        /*Criação do quarto objeto utilizando a classe ContaBanco, manipulando 
        atributos e metodos desta classe. */
        ContaBanco conta1 = new ContaBanco();
        System.out.println("Informe o seu nome: ");
        String username = scanner.nextLine();
        System.out.println("Informe o seu sobrenome: ");
        String usersurname = scanner.nextLine();
        conta1.cadastro(username, usersurname);
    }
    
}
