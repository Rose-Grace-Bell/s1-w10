
import java.awt.*;
import javax.swing.*;

public class Greetings2 extends JPanel {
	
   private int myWindowWidth = 500;
   private int myWindowHeight = 500;
	
   public Greetings2() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }
   
   public void paintComponent (Graphics g) {
      this.newDrawLine(g,0,0,500,500);
      for (int index = 0; index < 200; index = index + 5) {
         this.newDrawRect(g,index,index,index,index);
      }
   }
   
   public void newDrawLine(Graphics g,int x, int y, int x1, int y1){
      g.drawLine(x,y,x1,y1);
   }
   
   // Step 25 Write newDrawRect2 here, which calls drawLine four times.
   public void newDrawRect(Graphics g, int tlx, int tly, int width, int height) {
      g.drawLine(tlx,tly,tlx+width,tly);
      g.drawLine(tlx+width,tly,tlx+width,tly+height);
      g.drawLine(tlx,tly+height,tlx+width,tly+height);
      g.drawLine(tlx,tly+height,tlx,tly);
   }
   
   // Step 26 This method takes top-left x, top-left y, bottom-right x, bottom-right y to define
   //  a rectangle.  It should take drawRect.
   public void newDrawRect2(Graphics g, int tlx, int tly, int brx, int bry) {
      g.drawLine(tlx,tly,tlx,bry);
      g.drawLine(tlx,tly,brx,tly);
      g.drawLine(brx,tly,brx,bry);
      g.drawLine(tlx,bry,brx,bry);
      
   }

   public void safeDrawRect(Graphics g, int tlx, int tly, int brx, int bry){
      int maxX = this.getSize().width;
      int maxY = this.getSize().height;
      if (tlx >=0 && tly >=0 && tlx <= maxX && tly <= maxY)
         this.newDrawRect2(g,tlx,tly,brx,bry);
   }
}
