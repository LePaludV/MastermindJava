import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


public class VueProposition extends Canvas {
	Modèle mdl;
	Color couleur=Color.black;
	int x=10;
	int y=10;


	public VueProposition(Modèle mdl){
		this.mdl=mdl;
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(400,600));


	}
	public void NouvelProposition(Rangée r){
		for(Color c :r.jetons) {
			paint(getGraphics() , c, x, y,false);
			this.x+=300/r.jetons.length;
		}
		
		int noir=r.résultat[1];
		int blanc=r.résultat[0];
		int xR=325;
		int yR=this.y;
		
		for (int i=0;i<noir;i++) {
			System.out.println(xR);
			System.out.println(yR);
			System.out.println("NOIR");
			paint(getGraphics() , Color.black,xR, yR,true);
			
			
			if(xR==325 && yR==this.y ) {
				xR+=25;
			}
			else if(xR==350 && yR==this.y) {
				xR=325;
				yR=this.y+25;
			}
			else if (yR==this.y+25 && xR==325) {
				yR=this.y+25;
				xR=350;
			}
			else if (yR==this.y+25&& xR==350){
				xR=325;
				yR=this.y;
			}
			
			
		
			
			
			
		}
		
		for (int i=0;i<blanc;i++) {
			paint(getGraphics() , Color.WHITE,xR, yR,true);
			System.out.println(xR);
			System.out.println(yR);
			if(xR==325 && yR==this.y ) {
				xR+=25;
			}
			else if(xR==350 && yR==this.y) {
				xR=325;
				yR=this.y+25;
			}
			else if (yR==this.y+25 && xR==325) {
				yR=this.y+25;
				xR=350;
			}
			else if (yR==this.y+25&& xR==350){
				xR=325;
				yR=this.y;
			}
			
		}


		this.y+=60;
		this.x=10;
	}


	public void paint(Graphics g,Color c,int x,int y,boolean résultat) {
		if(résultat) {
				g.setColor(c);
				g.fillOval(x, y, 15, 15);
			}
		else {
				g.setColor(c);
				g.fillOval(this.x, y, 26, 26);
			}
		
	}
}