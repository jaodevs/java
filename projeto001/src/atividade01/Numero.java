
package atividade01;
import javax.swing.JOptionPane;
// subtrair(tipo valor)
    // dividir(tipo valor)
    // multiplicar(tipo valor)
     // atributo para representar o valor deste objeto

public class Numero {
    
    
   public class valor{

    public int y;

   }

    
   
  private int x = 4;
    
    
    public class operações{
      public static void main(String args[]){
        int soma;
        int subtrair;
        int multiplicar;
        int valor = 0;
        int x;
        

        valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite valor" ));

        x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite valor" ));

        soma = x + valor;

        JOptionPane.showMessageDialog(null, "A soma dos valores é"+ soma);

        
        subtrair = x - valor;
        JOptionPane.showMessageDialog(null, "A subtração dos valores é"+ subtrair);

        multiplicar = x * valor;
        
        JOptionPane.showMessageDialog(null, "A multiplicação dos valores é"+ multiplicar);

        


      }
    }
   

  
    
}
