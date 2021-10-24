package view;

import fr.dauphine.javaavance.td1.Circle;
import fr.dauphine.javaavance.td1.Point;
import fr.dauphine.javaavance.td1.PolyLine;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
//JFrame crée une fenetre avec un menu et JPanel crée un conteneur.
//Graphics est la classe qui permet de creer de dessin
//Graphics2D est la classe fille de Graphics plus sophistiquéé et ajoutent des details a ton dessin.
// 5) frame.repaint()
//Java.awt utilise les bibliotheques graphiques du OS pour les affichages. Donc il se peut que lorsqu'un code est écrit en
//awt, l'affichage peut varier d'un OS à un autre.
//Java swing va utiliser les librairies graphiques de la JWM. La différence est qu'il y aura pas de différence d'un OS à un autre.


public class MyDisplay extends JPanel {

    public ArrayList<ShapeView> shapesToDraw;
    public CircleView circleView;

    public MyDisplay(ArrayList<ShapeView> shapesToDraw){
        this.shapesToDraw=shapesToDraw;
    }

    public MyDisplay(CircleView circleView){
       this.circleView = circleView ;
    }
    @Override
    protected void paintComponent(Graphics g){
/*
        g.drawLine(0,0,100,100);
        g.drawLine(100,100,400,0);
        //g.drawOval(100,100,400,400);
        //g.drawOval(100-250,100,500,500);

        MyDisplay.drawCercle(g,100,100,100);
        MyDisplay.drawCercle(g,100,100,200);*/
        //je vais déléguer le dessin aux méthodes qui auront été reddéfinis dans chacune des classes qui ont implémentés ShapeView.

        //g.drawOval(100,100,500,500);
        //circleView.dessiner(g);




        for ( ShapeView shapeToDrawIt : shapesToDraw) {
            shapeToDrawIt.dessiner(g);
        }


    }

    public static void drawCercle(Graphics g,int x, int y, int diametre){
        int leftCornerx=x-diametre/2;
        int leftCornery =y-diametre/2;

        g.drawOval(leftCornerx,leftCornery,diametre,diametre);
    }

}
