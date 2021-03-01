import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class VueClavier extends Panel  {

	Modèle mdl;
	
	public VueClavier(Modèle mdl, ActionListener l) {
		this.mdl=mdl;
		
		Color[] Couleur=this.mdl.COULEURS;
		this.setLayout(new GridLayout());
		for(int i=0;i<Couleur.length;i++) {
			Button b = new Button();
			b.setBackground(Couleur[i]);
			b.addActionListener(l);

			this.add(b);
		}
		
		
			
		}
	public void partieGagné( ActionListener l) {
		
		this.removeAll();
		this.setLayout(new BorderLayout());
		Button b = new Button("Partie Gagné");
		b.addActionListener(l);
		b.setSize(getSize());
		this.add(b,BorderLayout.CENTER);
	}
	
	public void partiePerdue( ActionListener l) {
		this.removeAll();
		this.setLayout(new BorderLayout());
		Button b = new Button("Partie Perdue");
		b.addActionListener(l);
		b.setSize(getSize());
		this.add(b,BorderLayout.CENTER);
	}

}
