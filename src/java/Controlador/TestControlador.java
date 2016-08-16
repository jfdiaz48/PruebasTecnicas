/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import Modelo.*;
import java.util.List;

/**
 *
 * @author asus
 */
@Named(value = "testControlador")
@SessionScoped
public class TestControlador implements Serializable {

   
    
    public TestControlador() {
    }
    
    public List<Preguntas> llenarArrayPreguntas(){
        List<Preguntas> arrayPreguntas = new ArrayList<>();
        Preguntas pregunta = new Preguntas ();
        pregunta.setPalabraDerecha("abcdefghi");
        pregunta.setPalabraIzquierda("acbdefghi");
        pregunta.setRespuesta(false);
        arrayPreguntas.add(pregunta);
        Preguntas pregunta2 = new Preguntas();
        pregunta2.setPalabraDerecha("abcdefghy");
        pregunta2.setPalabraIzquierda("acbdefghy");
        pregunta2.setRespuesta(false);
        arrayPreguntas.add(pregunta2);
        return arrayPreguntas;
    }

    
}
