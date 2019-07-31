/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jorge Morales
 */
public class Hormiga {
    private int[] pos;
    private int dir;
    
    public Hormiga(int x, int y, int dir){
        this.pos = new int[2];
        this.pos[0] = x;
        this.pos[1] = y;
        this.dir = dir;
    }
    
    public int move(int c){
        //0 Negro 1 Blanco
        if(c==0){
            this.dir -= 1;
            if(this.dir<0){
                this.dir = 3;
            }
            switch(this.dir){
                case 0:
                    this.pos[0]++;
                    break;
                case 1:
                    this.pos[1]++;
                    break;
                case 2:
                    this.pos[0]--;
                    break;
                case 3:
                    this.pos[1]--;
                    break;
            }
            return 1;
        } else{
            this.dir += 1;
            if(this.dir>3){
                this.dir = 0;
            }
            switch(this.dir){
                case 0:
                    this.pos[0]++;
                    break;
                case 1:
                    this.pos[1]++;
                    break;
                case 2:
                    this.pos[0]--;
                    break;
                case 3:
                    this.pos[1]--;
                    break;
            }
            return 0;
        }
    }

    public int[] getPos() {
        return pos;
    }

    public void setPos(int[] pos) {
        this.pos = pos;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }
    
}
