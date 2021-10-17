package fr.dauphine.javaavance.td1;

import java.util.Objects;

public class Point {

    private int x;
    private int y;
    private static int compteur=0;
    private int id;



    public Point(int abs,int ord) {
        this.x=abs;
        this.y=ord;
        Point.compteur++;
        this.id=Point.compteur;

    }
    public Point() {
        this.x=0;
        this.y=0;
        Point.compteur++;
        this.id=Point.compteur;
    }
    public Point(Point p1){
        this.x=p1.xGet();
        this.y=p1.yGet();
        Point.compteur++;
        this.id=Point.compteur;
    }
    public void create() {
        Point p2=new Point();
        System.out.println(p2.x + " " + p2.y);
        System.out.println(this.x + " " + this.y);
    }
    public static int nombrePointsCrees(){
        return  Point.compteur;
    }
    public int getId(){
        return this.id;
    }
    public int xGet() {
        return this.x;
    }
    public int yGet() {
        return this.y;
    }
    @Override
    public String toString(){
        return  "( " + this.xGet() + " , " + this.yGet() + " )";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return this.isSameAs(point) ;
    }



    public boolean isSameAs(Point p1){
        return ((p1.xGet()==this.x) && (p1.yGet()==this.y));
    }

    //7) On utilise une variable static compteur privé qui va s'incrémenter à chaque fois qu'un nouvel objet Point
    // est instancié.

    //MEthode 1
    public void translate(int dx,int dy){
        this.x=this.xGet()+dx;
        this.y=this.yGet()+dy;
    }

    public Point translate2(int dx, int dy){
        return  new Point(this.xGet()+dx,this.yGet()+dy);
    }


}

