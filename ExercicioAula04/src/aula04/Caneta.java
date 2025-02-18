package aula04;


public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampa;
    
    public Caneta(String m, String c, float p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.setTampa();   
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
     
    public void setCor(String c){
        this.cor = c;
    }
     
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public boolean getTampa(){
        return this.tampa;
    }
    
    public void setTampa(){
        this.tampa = this.tampa != true;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Está tampada? " + this.getTampa());
    }
}