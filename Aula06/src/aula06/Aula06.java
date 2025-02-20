package aula06;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        
        c1.ligar();
        c1.abrirMenu();
        c1.fecharMenu();
        for(int i = 0; i < 3; i++){
            c1.maisVolume();
        }
        c1.play();
        c1.abrirMenu();
        c1.fecharMenu();
        c1.desligar();
        c1.abrirMenu();
        
    }
    
}
