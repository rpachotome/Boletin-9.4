
package boletin.pkg07.pkg3;

import javax.swing.JOptionPane;

public class Comparador {
    
 public double num1;
    
    public Comparador(){
    }
    public double pedirDato(){
      String respuesta=JOptionPane.showInputDialog("Introduzca un numero si es tan amable");
      double valor = Double.parseDouble(respuesta);
      num1=valor;
      return num1;
    }

    public void comparacion (double num1){
        if (num1>0){
        JOptionPane.showMessageDialog(null, "+");
        }
        else if (num1==0){
        JOptionPane.showMessageDialog(null, "0");
    }
        else{
            JOptionPane.showMessageDialog(null, "-");
        }
     
        
    }

    
    }
    


