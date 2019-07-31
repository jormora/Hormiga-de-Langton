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
public class Tablero {
    private int table[][];
    private Hormiga ant;
    
    public Tablero(){
        this.table = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                this.table[i][j] = 0;
            }
        }
        this.ant = new Hormiga(49, 49, 0);
    }
    
    public void accion(){
        try{
            int x, y, c;
            x = this.ant.getPos()[0];
            y = this.ant.getPos()[1];
            c = this.table[x][y];
            this.table[x][y] = this.ant.move(c);
        } catch(Exception e){
            System.out.println("Limite alcanzado");
            int[] pos = new int[2];
            pos[0] = 49;
            pos[1] = 49;
            this.ant.setDir(0);
            this.ant.setPos(pos);
        }
    }

    public int[][] getTable() {
        return table;
    }

    public void setTable(int[][] table) {
        this.table = table;
    }

    public Hormiga getAnt() {
        return ant;
    }

    public void setAnt(Hormiga ant) {
        this.ant = ant;
    }
    
}
