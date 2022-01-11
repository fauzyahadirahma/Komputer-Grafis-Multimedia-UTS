/*
 * Nama    : Fauzyah Hadirahma
 * NPM     : 20191310070
 * Tanggal : 3 Juli 2021
 */
package uts_fauzyahhadirahma;

/**
 *
 * @author Fauzyah
 */
import java.awt.*;

public class Line2d {
    private point2d src;
    private point2d dest;
    
    public Line2d (float x1, float y1, float x2, float y2) {
        src =  new point2d(x1, y1);
        dest = new point2d(x2, y2);
    }//end constructor
    
    public void draw(Graphics g) {
        g.drawLine((int)src.x(), (int)src.y(), (int)dest.x(), (int)dest.y());
    }//end draw
}