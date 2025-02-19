package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos Personalizados    
    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        switch (this.getTipo()) {
            case "cc":
                this.setSaldo(50f);
                break;
            case "cp":
                this.setSaldo(150f);
                break;
        }
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Erro! Existe saldo na conta!");
        } else if(this.getSaldo() < 0){
            System.out.println("Erro! Existe debito na conta!");
        } else {
            this.setStatus(false);
            
        }
    }
    
    public void depositar(float valor){
        if(this.getStatus())this.setSaldo(this.getSaldo() + valor);
    }
    
    public void sacar(float valor){
        if(this.getStatus()){
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado no valor de R$" + valor + " por " + this.getDono());
            } else {
                System.out.println("Erro! Saldo Insuficiente.");
            }
        } else {
            System.out.println("Erro! Conta fechada!");
        }
    }
    
    public void pagarMensal(){
        
            switch (this.getTipo()) {
                case "cc":
                    if(this.getSaldo() >= 12){
                        this.setSaldo(this.getSaldo() - 12f);
                        System.out.println("Mensalidade paga com sucesso por " + this.getDono());
                    } else {
                        System.out.println("Erro! Saldo Insuficiente.");
                    }
                    break;
                case "cp":
                    if(this.getSaldo() >= 20){
                        this.setSaldo(this.getSaldo() - 20f);
                        System.out.println("Mensalidade paga com sucesso por " + this.getDono());
                    } else {
                        System.out.println("Erro! Saldo Insuficiente.");
                    }
                    break;
                default:
                    System.out.println("Erro! Conta Inválida!");
            }
    }
    
    public void status(){
        System.out.println("O número da conta é: " + this.getNumConta());
        System.out.println("O dono da conta é: " + this.getDono());
        System.out.println("A conta é do tipo: " + this.getStatus());
        System.out.println("O saldo na conta é: " + this.getSaldo());
        System.out.println("A conta está aberta? " + this.getStatus());
        System.out.println("--------------------------------------------");
    }
    
    //Metodos Especiais
    public ContaBanco() {
        this.status = false;
        this.saldo = 0f;
    }
        
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int num){
        this.numConta = num;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        switch(t){
            case "cc":
                this.tipo = t;
                break;
            case "cp":
                this.tipo = t;
                break;
            default:
                System.out.println("Erro! Tipo Inválido");
        }
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String newDono){
        this.dono = newDono;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float valor){
        this.saldo = valor;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean newStatus){
        this.status = newStatus;
    }
}
