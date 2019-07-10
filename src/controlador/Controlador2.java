/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import modelo.Dao;
import vista.Escena1;
import vista.Escena2;
import vista.Escena3;

/**
 *
 * @author Estudiante
 */
public class Controlador2 {
     private Escena2 vista;
     private Dao modelo;
     private String nombre;
     private String apellido;
    
     
     public Controlador2(String nombre, String apellido) {
    this.vista=new Escena2();
    this.vista.getBtGuardar().setOnAction(new Evento());
    this.nombre=nombre;
    this.apellido=apellido;
    }

    public Escena2 getVista() {
        return vista;
    }

    public void setVista(Escena2 vista) {
        this.vista = vista;
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
            boolean bachillerato=vista.getRbBachillerato().isSelected();
        
            boolean pregrado= vista.getRbPregrado().isSelected();
            
            boolean posgrado= vista.getRbPosgrado().isSelected();
            
            System.out.println(nombre);
            System.out.println(apellido);
            
         Singleton singleton= Singleton.getSingleton();
         Stage stage= singleton.getStage();
  Controlador3 controlador = new 
               Controlador3();
         Escena3 escena =
                   controlador.getEscena();
           stage.setScene( escena.getScene());
           stage.show();
        }
        
    }
     
     
}
