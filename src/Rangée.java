import java.awt.Color;

public class Rangée {
	
	Modèle mdl;
	Color[] jetons;
	int indiceJeton;
	int[] résultat;
	
	public Rangée(Modèle mdl) {
		this.mdl = mdl;
		this.indiceJeton = mdl.DIFFICULTE;
		this.jetons = new Color[mdl.DIFFICULTE];
		this.résultat = new int[2];
	}

}
