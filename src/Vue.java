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

public class Vue extends Frame implements WindowListener{
	Modèle mdl;
	
	Frame Jeu = new Frame();
	Panel VueClavier =new Panel();
	Canvas VueProposition= new Canvas();
	
	public Vue (Modèle mdl){
		this.mdl=mdl;
			
		
		
		this.setLayout(new BorderLayout());
		this.add(VueClavier,BorderLayout.SOUTH);
		this.add(VueProposition,BorderLayout.NORTH);

		Color[] Couleur=this.mdl.COULEURS;
		
		for(int i=0;i<Couleur.length;i++) {
			Button b = new Button();
			b.setBackground(Couleur[i]);
			this.VueClavier.add(b);
		}
		
		this.VueProposition.setPreferredSize(new Dimension(400,600));
		
		
		this.setSize(500, 500);
		this.setTitle("Mastermind");
		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);

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

}
