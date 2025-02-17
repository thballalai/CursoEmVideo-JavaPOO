// Criação da classe ContaBanco, para referenciar um objeto abstrato.
package exercicioaula02;

public class ContaBanco {
    String userName;
    String userSurname;
    int Idade;
    int Saldo;
    boolean devendo;
    
    void cadastro(String a, String b){
        this.userName = a;
        this.userSurname = b;
        System.out.printf("Conta criada com sucesso! %s %s \n", a, b);
    }
}
