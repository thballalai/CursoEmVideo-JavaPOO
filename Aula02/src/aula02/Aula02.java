package aula02;
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
//        c1.carga = 100;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
    }
    
}
