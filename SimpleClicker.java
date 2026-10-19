import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener {
    public int hp = 10;

	private int xClick = -1000;
	private int yClick = -1000;
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }

	public void paintComponent(Graphics g){
		g.setColor(Color.red);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));
		if (xClick != -1000 && yClick != -1000)
			g.drawOval(xClick, yClick, 20,20);
	}
    
    public void mouseClicked (MouseEvent event) {
		this.xClick = event.getX()-10;
		this.yClick = event.getY()-10;
		repaint();
	}
	
	public void mouseReleased (MouseEvent event) {
		this.xClick = event.getX()-10;
		this.yClick = event.getY()-10;
		repaint();
	}
	
	public void mousePressed (MouseEvent event) {
		this.xClick = event.getX()-10;
		this.yClick = event.getY()-10;
		repaint();
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}

	 public static void main(String[] args) {
        new SimpleClicker();
    }
}
