import java.awt.Color;

public class Rang�e {
	
	Mod�le mdl;
	Color[] jetons;
	int indiceJeton;
	int[] r�sultat;
	
	public Rang�e(Mod�le mdl) {
		this.mdl = mdl;
		this.indiceJeton = 0;
		this.jetons = new Color[mdl.DIFFICULTE];
		this.r�sultat = new int[2];
	}

}
