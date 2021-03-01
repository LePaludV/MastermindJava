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
		if(noir!=0) {
			paint(getGraphics() , Color.black,325, y,true);
			noir-=1;}
		else if(blanc!=0) {
			paint(getGraphics() , Color.WHITE,325, y,true);
			blanc-=1;}

		if(noir!=0) {
			paint(getGraphics() , Color.black,350, y,true);
			noir-=1;}
		else if(blanc!=0) {
			paint(getGraphics() , Color.WHITE,350, y,true);
			blanc-=1;}

		if(noir!=0) {
			paint(getGraphics() , Color.black,325, y+25,true);
			noir-=1;}
		else if(blanc!=0) {
			paint(getGraphics() , Color.WHITE,325, y+25,true);
			blanc-=1;}

		if(noir!=0) {
			paint(getGraphics() , Color.black,350, y+25,true);
			noir-=1;}
		else if(blanc!=0) {
			paint(getGraphics() , Color.WHITE,350, y+25,true);
			blanc-=1;}


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