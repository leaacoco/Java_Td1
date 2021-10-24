package view;

import fr.dauphine.javaavance.td1.Point;
import fr.dauphine.javaavance.td1.PolyLine;

import java.awt.*;
import java.util.LinkedList;

public class PolyLineView implements ShapeView {
    public PolyLine polyLine;

    public PolyLineView(PolyLine polyline) {
        this.polyLine = polyline;

    }

    public void dessiner(Graphics graphic) {
        LinkedList<Point> listePoints = polyLine.listePoints;
        for (int i = 0; i < listePoints.size() - 1; i++) { //on met de cote le dernier element car quand p1=dernier ele, p2 sort de la liste: erreur
            Point p1= listePoints.get(i);
            Point p2=listePoints.get(i+1);
            graphic.drawLine(p1.xGet(), p1.yGet(), p2.xGet(),p2.yGet());


        }
    }
}
