/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author asus
 */
public class Preguntas {
    
    private int id;
    private String palabraDerecha;
    private String palabraIzquierda;
    private boolean respuesta;

    public Preguntas() {
    }
    
    public String getPalabraDerecha() {
        return palabraDerecha;
    }

    public void setPalabraDerecha(String palabraDerecha) {
        this.palabraDerecha = palabraDerecha;
    }

    public String getPalabraIzquierda() {
        return palabraIzquierda;
    }

    public void setPalabraIzquierda(String palabraIzquierda) {
        this.palabraIzquierda = palabraIzquierda;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
    
}
