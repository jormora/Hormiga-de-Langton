/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Tablero;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Jorge Morales
 */
public class View extends AnimationTimer{
    private Scene scene;
    private final GraphicsContext lapiz;
    private Tablero t;

    public View(Scene scene, GraphicsContext lapiz, Tablero t) {
        this.scene = scene;
        this.lapiz = lapiz;
        this.t = t;
        this.lapiz.setFill(Color.WHITE);
    }

    @Override
    public void handle(long time) {
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(this.t.getTable()[i][j]==1){
                    if(this.t.getAnt().getPos()[0]==i&&this.t.getAnt().getPos()[1]==j){
                        this.lapiz.clearRect(j*6, i*6, 6, 6);
                        this.lapiz.setFill(Color.RED);
                        this.lapiz.fillRect(j*6, i*6, 6, 6);
                        this.lapiz.setFill(Color.WHITE);
                    }else{
                        this.lapiz.fillRect(j*6, i*6, 6, 6);
                    }
                } else{
                    if(this.t.getAnt().getPos()[0]==i&&this.t.getAnt().getPos()[1]==j){
                        this.lapiz.clearRect(j*6, i*6, 6, 6);
                        this.lapiz.setFill(Color.RED);
                        this.lapiz.fillRect(j*6, i*6, 6, 6);
                        this.lapiz.setFill(Color.WHITE);
                    }else{
                        this.lapiz.clearRect(j*6, i*6, 6, 6);
                    }
                }
            }
        }
        this.t.accion();
    }
}
