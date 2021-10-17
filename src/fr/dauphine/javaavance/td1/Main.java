package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
    Point p = null ;
    p.yGet();*/
       PolyLine polyline = new PolyLine(2);
       //polyline.add(null);
        //polyline.add(new Point(2,2));
       polyline.add(new Point(1,2));
     //  System.out.println(polyline.contains(new Point(2,2)));
       Point p5=new Point(1,2);
       Point p4;

       p4 = p5;
    // Circle c=new Circle(p5,100)  ; // cercle de centre (1,2) et de rayon 100
     //   System.out.println(c);

        Point p=new Point(1,2);
      // System.out.println(p);
     //  p4 = new Point(p);
     //  System.out.println(p4);
        Circle c=new Circle(p,1);
       // System.out.println(c.centre);

        Circle c2=new Circle(p,2);
        //System.out.println(c2.centre);
        c2.translate(1,1);
        System.out.println(c+" "+c2); //  le centre du cercle c est déplacé sans le vouloir.

        Circle c5=new Circle(new Point(1,2), 1);
        c5.getCentre().translate(1,1);
        System.out.println(c5);

        Anneaux anneaux=new Anneaux(100,102,p);
        System.out.println(anneaux); //4)ca appelle la meth toString de la classe


       // System.out.println(polyline.contains(null));
    //   polyline.add(new Point(3,4));
       /*  Point p1=new Point(1,2);

         Point p2=new Point(3,4);
         Point p3=new Point(5,6);

        System.out.println(Point.nombrePointsCrees());
        System.out.println(p1.getId());
        System.out.println(p3.getId());
        System.out.println(p1.toString());
        System.out.println(p1);
*/
/*
        Point p1 = new Point(1, 2);
        Point p2 = p1;
        Point p3 = new Point(1, 2);

        ArrayList<Point> list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));*/

       /* System.out.println(p1.xGet());
        System.out.println(p2.xGet());
        p1.compteur=5;
        System.out.println(p1.compteur);
        p2.compteur=6;
        System.out.println(p2.compteur);*/

       /* System.out.println(p1.compteur);
        p1.compteur=0;
        System.out.println(Point.compteur);
*/

        /*
        Point p1=new Point(1,2);
        Point p2=new Point(3,4);

        p1.x = 10;
        System.out.println(p1.x  + " " + p2.x);
        p2.x = 20;
        System.out.println(p1.x  + " " + p2.x);*/

        //exo6) 1)Pour creer un anneau il faut 2 rayons et un centre donc on peut heriter de la classe Circle qui possede deja
       // un rayon et un cercle.


    }
}
