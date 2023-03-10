/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.pieces;

/**
 *
 * @author mascport
 */
public abstract class Piece {
    protected int movx[];
    protected int movy[];
    protected String name;
    protected String image;
    protected boolean affectsdimension = false;

    public boolean afectaDimension() {
        return affectsdimension;
    }
    
    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
    
    public int getNumMovs() {
        return movx.length;
    }
    
    public int getMovX(int i) {
        return movx[i];
    }
    
    public int getMovY(int i) {
        return movy[i];
    }
}
