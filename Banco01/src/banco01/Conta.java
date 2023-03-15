
package banco01;


public class Conta {
    //Atributos
    private String dono;
    private int num;
    private double saldo;
    private double limite;
    
    //Construtor
    public Conta(){
       System.out.println("Conta criada");
       limite = 1000;
    }
    
    //Metodos

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }
    
    public void saque(double valor) {
        this.saldo -= valor;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setDono(String novoDono){
        dono = novoDono;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
