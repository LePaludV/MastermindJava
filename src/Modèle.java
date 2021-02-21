import java.awt.Color;
import java.util.Random;

public class Mod�le {
	
	Color[] COULEURS = {Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.RED, Color.ORANGE, Color.BLACK, Color.WHITE};
	
	int N_TENTATIVES = 10;
	int DIFFICULTE = 4;
	enum Etat {EN_COURS, GAGNE, PERDU};
	
	Etat �tat;
	Rang�e combinaison;
	Rang�e[] propositions;
	int tentative;
	
	public Mod�le() {
		this.combinaison = new Rang�e(this);
		this.propositions = new Rang�e[this.N_TENTATIVES];
		this.tentative = 0;
		Random r = new Random();
		
		for (int i=0;i<this.DIFFICULTE;i++) {
			this.combinaison.jetons[i] = this.COULEURS[r.nextInt(this.COULEURS.length)];
			System.out.println(this.combinaison.jetons[i]);
		}
	}
	
	public void archiverProp(Rang�e r) {
		this.propositions[tentative] = r;
	}
	
	public boolean �valuerProp() {
		Rang�e rang�eCourante = this.propositions[this.tentative];
		
		for (int i=0;i<rang�eCourante.jetons.length;i++) {
			if (rang�eCourante.jetons[i].equals(this.combinaison.jetons[i])) {
				rang�eCourante.r�sultat[1]++;
			} else {
				for (int j=0;j<this.combinaison.jetons.length;j++) {
					if (rang�eCourante.jetons[j].equals(this.combinaison.jetons[i])) {
						rang�eCourante.r�sultat[0]++;
					}
				}
			}
		}
		
		this.tentative++;
		return rang�eCourante.r�sultat[1]==this.DIFFICULTE;
	}
}
