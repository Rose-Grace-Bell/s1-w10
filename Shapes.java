import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 500;
   private int myWindowHeight = 500;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      this.bullseye(g);
   }
   public void bullseye(Graphics g){
      for (int i = 300; i > 0; i = i-10) {
         if(i%20 != 0)
            g.setColor(Color.BLACK);
         else
            g.setColor(Color.red);
         g.fillOval((400-i)/2,(400-i)/2,i,i);
      }
   }

   public static void main(String[] args) {
       new Shapes(); 
    }
}