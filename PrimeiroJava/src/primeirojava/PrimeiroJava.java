
package primeirojava;
import javax.swing.JOptionPane;

class Pessoa{
    private String nome;
    private int diaNasc, mesNasc, anoNasc;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    public String getDataNasc(){
        return diaNasc + "/" + mesNasc + "/" + anoNasc;
        
    }
    
    public void setDataNasc(int dn, int mn, int an){
        diaNasc = dn;
        mesNasc = mn;
        anoNasc = an;
    }
}//Fim da classe Pessoa
    
public class PrimeiroJava {

    public static void main(String[] args) {//main
        JOptionPane.showMessageDialog(null, "Hello World\n");
        Pessoa p = new Pessoa();
        p.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        JOptionPane.showMessageDialog(null, p.getNome());
        
        int d = Integer.parseInt(JOptionPane.showInputDialog("Dia de Nascimento"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Mes de Nascimento"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento"));
        p.setDataNasc(d, m, a);
        
        JOptionPane.showMessageDialog(null, p.getNome() + " - " + p.getDataNasc());
    }//Fim do main
    
}
