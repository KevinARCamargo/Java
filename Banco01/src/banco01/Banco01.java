
package banco01;
import javax.swing.JOptionPane;
public class Banco01 {


    public static void main(String[] args) {
        Conta conta;
        conta = new Conta();
        conta.setDono(JOptionPane.showInputDialog("Digite o dono da conta: "));
        conta.deposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor depositado: ")));
        conta.setLimite(500);
        
        
        
        System.out.println(conta.getDono() + " Saldo: " + conta.getSaldo());
    }//Fim da main
    
}//Fim da Classe

