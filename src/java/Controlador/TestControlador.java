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


@Named(value = "testControlador")
@SessionScoped
public class TestControlador implements Serializable {

    
   private int estados;
    
    public TestControlador() {
    }
    
    public List<Preguntas> llenarArrayPreguntas(){
        List<Preguntas> arrayPreguntas = new ArrayList<>();
        Preguntas pregunta = new Preguntas ();
        pregunta.setPalabraDerecha("lhzrgufuhr");
        pregunta.setPalabraIzquierda("lhzfgufuhr");
        pregunta.setRespuesta(false);
        arrayPreguntas.add(pregunta);
        Preguntas pregunta2 = new Preguntas();
        pregunta2.setPalabraDerecha("cxmoeshhku");
        pregunta2.setPalabraIzquierda("cxmoeshhuu");
        pregunta2.setRespuesta(false);
        arrayPreguntas.add(pregunta2);
        Preguntas pregunta3 = new Preguntas();
        pregunta3.setPalabraDerecha("qvfkuuicvw");
        pregunta3.setPalabraIzquierda("qvfkuuicvw");
        pregunta3.setRespuesta(true);
        arrayPreguntas.add(pregunta3);
        Preguntas pregunta4 = new Preguntas();
        pregunta4.setPalabraDerecha("stifhmwgno");
        pregunta4.setPalabraIzquierda("stifhcwgno");
        pregunta4.setRespuesta(false);
        arrayPreguntas.add(pregunta4);
        Preguntas pregunta5 = new Preguntas();
        pregunta5.setPalabraDerecha("rqkpoughmw");
        pregunta5.setPalabraIzquierda("rqkpoughmw");
        pregunta5.setRespuesta(true);
        arrayPreguntas.add(pregunta5);
        Preguntas pregunta6 = new Preguntas();
        pregunta6.setPalabraDerecha("ctauovocwu");
        pregunta6.setPalabraIzquierda("ctauovocwu");
        pregunta6.setRespuesta(true);
        arrayPreguntas.add(pregunta6);
        Preguntas pregunta7 = new Preguntas();
        pregunta7.setPalabraDerecha("nonxigtvks");
        pregunta7.setPalabraIzquierda("nonxigtvks");
        pregunta7.setRespuesta(true);
        arrayPreguntas.add(pregunta7);
        Preguntas pregunta8 = new Preguntas();
        pregunta8.setPalabraDerecha("ljjthdmrdd");
        pregunta8.setPalabraIzquierda("ljjthmmrdd");
        pregunta8.setRespuesta(false);
        arrayPreguntas.add(pregunta8);
        Preguntas pregunta9 = new Preguntas();
        pregunta9.setPalabraDerecha("nwawkoiqbc");
        pregunta9.setPalabraIzquierda("nwawkoiqbc");
        pregunta9.setRespuesta(true);
        arrayPreguntas.add(pregunta9);
        Preguntas pregunta10 = new Preguntas();
        pregunta10.setPalabraDerecha("btxlesfgio");
        pregunta10.setPalabraIzquierda("btxlesfgio");
        pregunta10.setRespuesta(true);
        arrayPreguntas.add(pregunta10);
        Preguntas pregunta11 = new Preguntas();
        pregunta11.setPalabraDerecha("neushmwlmj");
        pregunta11.setPalabraIzquierda("neushmwlmj");
        pregunta11.setRespuesta(true);
        arrayPreguntas.add(pregunta11);
        Preguntas pregunta12 = new Preguntas();
        pregunta12.setPalabraDerecha("pjlddmyfzc");
        pregunta12.setPalabraIzquierda("pjhddmyfzc");
        pregunta12.setRespuesta(false);
        arrayPreguntas.add(pregunta12);
        Preguntas pregunta13 = new Preguntas();
        pregunta13.setPalabraDerecha("pdhdktdvno");
        pregunta13.setPalabraIzquierda("pdhdktdvno");
        pregunta13.setRespuesta(true);
        arrayPreguntas.add(pregunta13);
        Preguntas pregunta14 = new Preguntas();
        pregunta14.setPalabraDerecha("odpvexlczv");
        pregunta14.setPalabraIzquierda("odpvexlczv");
        pregunta14.setRespuesta(true);
        arrayPreguntas.add(pregunta14);
        Preguntas pregunta15 = new Preguntas();
        pregunta15.setPalabraDerecha("xwxbcswskh");
        pregunta15.setPalabraIzquierda("xwxbbswskh");
        pregunta15.setRespuesta(false);
        arrayPreguntas.add(pregunta15);
        Preguntas pregunta16 = new Preguntas();
        pregunta16.setPalabraDerecha("eesapkntbw");
        pregunta16.setPalabraIzquierda("eesapkntbw");
        pregunta16.setRespuesta(false);
        arrayPreguntas.add(pregunta16);
        Preguntas pregunta17 = new Preguntas();
        pregunta17.setPalabraDerecha("gjviooavjr");
        pregunta17.setPalabraIzquierda("gjviooavqr");
        pregunta17.setRespuesta(false);
        arrayPreguntas.add(pregunta17);
        Preguntas pregunta18 = new Preguntas();
        pregunta18.setPalabraDerecha("iriyxenige");
        pregunta18.setPalabraIzquierda("iriyxenige");
        pregunta18.setRespuesta(true);
        arrayPreguntas.add(pregunta18);
        Preguntas pregunta19 = new Preguntas();
        pregunta19.setPalabraDerecha("hkqymgfbjr");
        pregunta19.setPalabraIzquierda("hyqymgfbjr");
        pregunta19.setRespuesta(false);
        arrayPreguntas.add(pregunta19);
        Preguntas pregunta20 = new Preguntas();
        pregunta20.setPalabraDerecha("exmwzjnsyx");
        pregunta20.setPalabraIzquierda("exmdzjnsyx");
        pregunta20.setRespuesta(false);
        arrayPreguntas.add(pregunta20);
        Preguntas pregunta21 = new Preguntas();
        pregunta21.setPalabraDerecha("exmwzjnsyx");
        pregunta21.setPalabraIzquierda("exmdzjnsyx");
        pregunta21.setRespuesta(false);
        arrayPreguntas.add(pregunta21);
        Preguntas pregunta22 = new Preguntas();
        pregunta22.setPalabraDerecha("ugulservcp");
        pregunta22.setPalabraIzquierda("ugupservcp");
        pregunta22.setRespuesta(false);
        arrayPreguntas.add(pregunta22);
        Preguntas pregunta23 = new Preguntas();
        pregunta23.setPalabraDerecha("uajwlhwqql");
        pregunta23.setPalabraIzquierda("uajwlhwqol");
        pregunta23.setRespuesta(false);
        arrayPreguntas.add(pregunta23);
        Preguntas pregunta24 = new Preguntas();
        pregunta24.setPalabraDerecha("xgwhjzndfu");
        pregunta24.setPalabraIzquierda("xgwhjzndfu");
        pregunta24.setRespuesta(true);
        arrayPreguntas.add(pregunta24);
        Preguntas pregunta25 = new Preguntas();
        pregunta25.setPalabraDerecha("nylbemszuc");
        pregunta25.setPalabraIzquierda("nylbemszuc");
        pregunta25.setRespuesta(true);
        arrayPreguntas.add(pregunta25);
        return arrayPreguntas;
    }
    
    public void empezarPrueba (){
        estados=1;
    }

    public int getEstados() {
        return estados;
    }

    public void setEstados(int estados) {
        this.estados = estados;
    }
    
}
