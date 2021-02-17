import java.awt.Color;
import java.util.Random;

public class Modèle {
	
	Color[] COULEURS = {Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.RED, Color.ORANGE, Color.BLACK, Color.WHITE};
	
	int N_TENTATIVES = 10;
	int DIFFICULTE = 4;
	enum Etat {EN_COURS, GAGNE, PERDU};
	
	Etat état;
	Rangée combinaison;
	Rangée[] propositions;
	int tentative;
	
	public Modèle() {
		this.combinaison = new Rangée(this);
		this.propositions = new Rangée[this.N_TENTATIVES];
		
		for (int i=0;i<this.DIFFICULTE;i++) {
			Random r = new Random();
			this.combinaison.jetons[i] = this.COULEURS[r.nextInt(this.COULEURS.length)];
		}
	}

}
