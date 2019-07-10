/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Dao;
import vista.Escena1;
import vista.Escena3;

/**
 *
 * @author Estudiante
 */
public class Controlador3 {
    private Escena3 escena;
    private Dao modelo;

    public Controlador3() {
    this.escena= new Escena3();
    escena.getBtVolver().setOnAction(new Evento());
    }

    public Escena3 getEscena() {
        return escena;
    }

    public void setEscena(Escena3 escena) {
        this.escena = escena;
    }

    public Dao getModelo() {
        return modelo;
    }

    public void setModelo(Dao modelo) {
        this.modelo = modelo;
    }
    private class Evento implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
           Singleton singleton= Singleton.getSingleton();
         Stage stage= singleton.getStage();
  Controlador1 controlador = new 
               Controlador1();
         Escena1 escena =
                   controlador.getEscena();
           stage.setScene( escena.getScene());
           stage.show();
        }
        
    }
}
