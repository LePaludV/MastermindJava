import java.awt.Canvas;
import java.awt.Dimension;

public class VueProposition extends Canvas{
	Mod�le mdl;

	
	public VueProposition(Mod�le mdl){
		this.mdl=mdl;
		this.setPreferredSize(new Dimension(400,600));
		
	}
}
