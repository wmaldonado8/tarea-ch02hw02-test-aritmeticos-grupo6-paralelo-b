/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.aritmetico;

/**
 *
 * @author PCD
 */
public class PreguntaResta implements PreguntaEntera{
    private int num1;
    private int num2;  
    private String entera;
    
    public String getPregunta(){
      return "Cuanto es "+num1+" - "+num2;
    }

    public int getRespuestaCorrecta(){
      return num1-num2;
    }
    
    public String compararRespuesta(int respuestaU){
        if (respuestaU==getRespuestaCorrecta()) {
            
            entera=getPregunta()+"="+getRespuestaCorrecta()+ " Correcta";
        }else{
            
            entera=getPregunta()+"="+getRespuestaCorrecta()+ "  Tu respuesta: "+respuestaU+" Incorrecta";
        }
        return entera;
    }
     public PreguntaResta() {
        this.num1 = (int) (Math.random()*50+1);
        this.num2 = (int) (Math.random()*50);
     }

    @Override
    public int getRespuestaCOrrecta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String compararRespuesta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
