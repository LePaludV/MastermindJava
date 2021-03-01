import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;

public class VueClavier extends Panel {

	Modèle mdl;
	
	public VueClavier(Modèle mdl, ActionListener l) {
		this.mdl=mdl;
		
		Color[] Couleur=this.mdl.COULEURS;
		this.setLayout(new GridLayout());
		for(int i=0;i<Couleur.length;i++) {
			Button b = new Button();
			b.setBackground(Couleur[i]);
			b.addActionListener(l);
			b.setSize(30, 30);
			this.add(b);
		}
		
		
			
		}
	public void partieGagné() {

		this.removeAll();
	}
	
	public void partiePerdue() {
		this.removeAll();
	}
}
