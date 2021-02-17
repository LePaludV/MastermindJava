
public class Main {

	public static void main(String[] args) {
		Modèle modl = new Modèle();
		Contrôleur ctrl = new Contrôleur(modl);
		new Vue(modl, ctrl);
		

	}

}
