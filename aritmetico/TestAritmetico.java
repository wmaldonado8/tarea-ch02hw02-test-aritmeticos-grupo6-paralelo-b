/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.aritmetico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PCD
 */
public class TestAritmetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entera="";
        int puntuacion=0;
        int []RUsuario = new int [10];
        int []RCorrecta = new int [10];
        JOptionPane.showMessageDialog(null,"Iniciar Test Aritmetico","Inicio",JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < 3; i++) {
             PreguntaResta resta=new PreguntaResta() {};
             int a=Integer.parseInt(JOptionPane.showInputDialog(null,resta.getPregunta()));
             resta.compararRespuesta(a);
             RUsuario[i]=a;
             RCorrecta[i]=resta.getRespuestaCorrecta();
             entera=entera+resta.compararRespuesta(a)+"\n";
        }
  
        for (int i = 3; i < 6; i++) {
             PreguntaAdicion suma=new PreguntaAdicion();
             int a=Integer.parseInt(JOptionPane.showInputDialog(null,suma.getPregunta()));
             suma.compararRespuesta(a);
             RUsuario[i]=a;
             RCorrecta[i]=suma.getRespuestaCorrecta();
             entera=entera+suma.compararRespuesta(a)+"\n";
        }
        
        for (int i = 6; i < 10; i++) {
             PreguntaMultiplicacion multi=new PreguntaMultiplicacion();
             int a=Integer.parseInt(JOptionPane.showInputDialog(null,multi.getPregunta()));
             multi.compararRespuesta(a);
             RUsuario[i]=a;
             RCorrecta[i]=multi.getRespuestaCorrecta();
             entera=entera+multi.compararRespuesta(a)+"\n";
        }

        for (int i = 0; i < 10; i++) {
            if (RCorrecta[i]==RUsuario[i]){
                puntuacion+=10;
            }
        }
        
      JOptionPane.showMessageDialog(null, "Lista de preguntas:\n"+entera+"\n\nPuntuacion: "+puntuacion+"/100");
     
    }
    
}
