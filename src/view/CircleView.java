package view;

import fr.dauphine.javaavance.td1.Circle;

import java.awt.*;

public class CircleView implements ShapeView {
    public Circle cercle;

    public CircleView(Circle cercle) {
        this.cercle = cercle;
    }

    public void dessiner(Graphics graphic) {
       MyDisplay.drawCercle(graphic,cercle.getCentre().xGet(),cercle.getCentre().yGet(),cercle.getRayon()*2);

    }
}
