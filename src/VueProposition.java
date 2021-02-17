import java.awt.Canvas;
import java.awt.Dimension;

public class VueProposition extends Canvas{
	Modèle mdl;

	
	public VueProposition(Modèle mdl){
		this.mdl=mdl;
		this.setPreferredSize(new Dimension(400,600));
		
	}
}
