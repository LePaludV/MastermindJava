import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Vue extends Frame implements WindowListener,Observer{
	Modèle mdl;
	
	Frame Jeu = new Frame();

	
	public Vue (Modèle mdl){
		this.mdl=mdl;
			
		
		
		this.setLayout(new BorderLayout());
		VueClavier VC =new VueClavier(mdl);
		VueProposition VP=new VueProposition(mdl);
		this.add(VC,BorderLayout.SOUTH);
		this.add(VP,BorderLayout.NORTH);


	
		
		this.setSize(500, 500);
		this.setTitle("Mastermind");
		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);
		
		mdl.addObserver(this);
	}

	public void paint(Graphics g) {
		Graphics2D g2;
        g2 = (Graphics2D) g;
        g2.drawString ("It is a custom canvas area", 70, 70);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
