package view;

import fr.dauphine.javaavance.td1.Anneaux;

import java.awt.*;

public class AnneauxView implements ShapeView {
    public Anneaux anneau;
    public AnneauxView(Anneaux anneau){
        this.anneau=anneau;
    }

    public void dessiner(Graphics graphics){
        MyDisplay.drawCercle(graphics,anneau.getCentre().xGet(),anneau.getCentre().yGet(), anneau.getRayon()*2);
        MyDisplay.drawCercle(graphics,anneau.getCentre().xGet(),anneau.getCentre().yGet(), anneau.rayon2*2);


    }

}
