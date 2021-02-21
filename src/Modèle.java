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
		this.tentative = 0;
		Random r = new Random();
		
		for (int i=0;i<this.DIFFICULTE;i++) {
			this.combinaison.jetons[i] = this.COULEURS[r.nextInt(this.COULEURS.length)];
			System.out.println(this.combinaison.jetons[i]);
		}
	}
	
	public void archiverProp(Rangée r) {
		this.propositions[tentative] = r;
	}
	
	public boolean évaluerProp() {
		Rangée rangéeCourante = this.propositions[this.tentative];
		
		for (int i=0;i<rangéeCourante.jetons.length;i++) {
			if (rangéeCourante.jetons[i].equals(this.combinaison.jetons[i])) {
				rangéeCourante.résultat[1]++;
			} else {
				for (int j=0;j<this.combinaison.jetons.length;j++) {
					if (rangéeCourante.jetons[j].equals(this.combinaison.jetons[i])) {
						rangéeCourante.résultat[0]++;
					}
				}
			}
		}
		
		this.tentative++;
		return rangéeCourante.résultat[1]==this.DIFFICULTE;
	}
}
