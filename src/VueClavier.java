import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;

public class VueClavier extends Panel {

	Modèle mdl;
	
	public VueClavier(Modèle mdl) {
		this.mdl=mdl;
		
		Color[] Couleur=this.mdl.COULEURS;
		
		for(int i=0;i<Couleur.length;i++) {
			Button b = new Button();
			b.setBackground(Couleur[i]);
			this.add(b);
		}
		
	}
}
