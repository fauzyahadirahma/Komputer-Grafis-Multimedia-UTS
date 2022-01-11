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
import java.util.*;
import java.awt.*;

public class Shaping2d {
    private point2d localOrigin =  new point2d(0, 0);
    private Vector lines = new Vector();
    private int numberOfLines=0;
    
    public void addLine (Line2d inLine) {
        lines.add(inLine);
        numberOfLines = numberOfLines + 1;
    }//end addLine
    
    public void addLine(float x1, float y1, float x2, float y2) {
        Line2d myLine = new Line2d(x1, y1, x2, y2);
        lines.add(myLine);
        numberOfLines = numberOfLines + 1;
    }//end addLine
    
    public void draw(Graphics g) {
        for (int i=0; i<numberOfLines; i = i+1) {
            ((Line2d)lines.get(i)).draw(g);
        }//end for i
    }//end draw
}
