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
import java.awt.event.*;
import javax.swing.*;

public class Grafika extends JFrame {

    private Shaping2d myShape = new Shaping2d();
    private Drawing2d myDrawing = new Drawing2d();
    private Gcanvas myGcanvas = new Gcanvas();
    
    public Grafika(){
        setBackground(Color.white);
        myDrawing.addShapes(myShape);
        myGcanvas.setDrawing(myDrawing);
        
        //F
        myShape.addLine((float)90, (float)150, (float)90, (float)50);//garis lurus
        myShape.addLine((float)90, (float)50, (float)140, (float)50);//garis atas
        myShape.addLine((float)90, (float)100, (float)140, (float)100);//garis bawah
        //A
        myShape.addLine((float)160, (float)150, (float)185, (float)50);//garis kanan
        myShape.addLine((float)173, (float)100, (float)197, (float)100); //garis tengah
        myShape.addLine((float)210, (float)150, (float)185, (float)50);//garis kiri
        //U
        myShape.addLine((float)230, (float)150, (float)230, (float)50);//garis kanan
        myShape.addLine((float)230, (float)150, (float)280, (float)150); //garis bawah
        myShape.addLine((float)280, (float)150, (float)280, (float)50);//garis kiri
        //Z
        myShape.addLine((float)300, (float)50, (float)350, (float)50);//garis atas
        myShape.addLine((float)300, (float)150, (float)350, (float)50); //garis miring
        myShape.addLine((float)300, (float)150, (float)350, (float)150);//garis bawah
        //Y
        myShape.addLine((float)404, (float)100, (float)370, (float)50);//garis kanan
        myShape.addLine((float)404, (float)150, (float)404, (float)100); //garis tengah
        myShape.addLine((float)404, (float)100, (float)438, (float)50); //garis kiri
        //A
        myShape.addLine((float)444, (float)150, (float)469, (float)50);//garis kanan
        myShape.addLine((float)457, (float)100, (float)481, (float)100); //garis tengah
        myShape.addLine((float)494, (float)150, (float)469, (float)50);//garis kiri
        //H
        myShape.addLine((float)514, (float)150, (float)514, (float)50);//garis
        myShape.addLine((float)514, (float)100, (float)564, (float)100); //garis 
        myShape.addLine((float)564, (float)150, (float)564, (float)50);//garis
        
        
    }//constuctor
    
    void thisWindowClosing(java.awt.event.WindowEvent e) {
        //Close the window when the close box is clicked
        setVisible(false);
        dispose();
        System.exit(0);
    }//end - thisWindowClosing
    
    public void initComponents() throws Exception {
        setLocation(new java.awt.Point(0, 30));
        setSize(new java.awt.Dimension(650, 400));
        setTitle("Graphics Application");
        getContentPane().add(myGcanvas);
        
        addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent e) {
                thisWindowClosing(e);
            }
        });
    }//end - initComponents
    
    public static void main(String[] args) {
        //Main entry point
        try {
            Grafika myGapp = new Grafika();
            myGapp.initComponents();
            myGapp.setVisible(true);
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
    }//end Main
}
