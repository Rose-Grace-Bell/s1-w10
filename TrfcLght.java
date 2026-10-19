import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrfcLght extends JPanel implements MouseListener{
    public int c = 1;

    public TrfcLght () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 1000);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.drawOval(50, 50, 200,200);
        g.drawOval(50, 300, 200,200);
        g.drawOval(50, 550, 200,200);
        if (c==1){
            g.setColor(Color.red);
            g.fillOval(50, 50, 200,200);
            c=2;
        }else if (c==2){
            g.setColor(Color.yellow);
            g.fillOval(50, 300, 200,200); 
            c=3;
        }else if (c==3){
            g.setColor(Color.green);
            g.fillOval(50, 550, 200,200);
            c=1;
        }
	}
    
    public void mouseClicked (MouseEvent event) {
		repaint();
	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}

    public static void main(String[] args) {
        new TrfcLght();
    }
}
