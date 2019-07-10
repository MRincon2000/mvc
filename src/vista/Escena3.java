/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 *
 * @author Estudiante
 */
public class Escena3 implements Vista{
    private Scene escena;
    private Button btVolver;

        public Escena3() {
        this.btVolver= new Button("Volver");
 this.escena=new Scene(btVolver,500,500);
    }
        @Override
    public Scene getScene() {
 
     return this.escena;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Button getBtVolver() {
        return btVolver;
    }

    public void setBtVolver(Button btVolver) {
        this.btVolver = btVolver;
    }


    
    
}
