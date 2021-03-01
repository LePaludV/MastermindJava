import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Observable;

public class Contrôleur extends Observable implements ActionListener  {
	
	Modèle mdl;
	Rangée current_proposition;
	
	public Contrôleur(Modèle mdl) {
		this.mdl = mdl;
		this.current_proposition = new Rangée(this.mdl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();
			int ind = this.current_proposition.indiceJeton;
			this.current_proposition.jetons[ind] = btn.getBackground();
			this.current_proposition.indiceJeton++;
			System.out.println("------------------");
			System.out.println(btn.getBackground());
			

			if (this.current_proposition.indiceJeton == this.mdl.DIFFICULTE) {
				this.setChanged();
				this.notifyObservers(this.current_proposition);
				this.mdl.archiverProp(this.current_proposition);
				this.current_proposition = new Rangée(this.mdl);
				System.out.println(this.mdl.évaluerProp());
			}
		}
		
	}
	
}
