import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class Vue extends Frame implements WindowListener{
	Modèle mdl;
	
	Frame Jeu = new Frame();
	Panel VueClavier =new Panel();
	
	public Vue (Modèle mdl){
		this.mdl=mdl;
			
		
		this.add(VueClavier);
		
		Color[] Couleur=this.mdl.COULEURS;
		
		for(int i=0;i<Couleur.length;i++) {
			Button b = new Button();
			b.setBackground(Couleur[i]);
			this.VueClavier.add(b);
		}
		
		
		
		this.setSize(500,500);
		this.setTitle("Visualisation d'images");
		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);

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
