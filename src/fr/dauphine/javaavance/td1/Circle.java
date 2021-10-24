package fr.dauphine.javaavance.td1;

import java.util.Objects;

public class Circle {
    private int rayon;
    private Point centre;


    //Point centre;
    // int rayon;
    //Point centre = p;
    public Circle(Point centre, int rayon){
        this.centre=new Point(centre);//new Point()
        this.rayon=rayon;
    }
    @Override
    public String toString(){
        return "cercle de centre " + this.centre + "et de rayon " + this.rayon +" d'aire "+ this.area(); // toString Implicite pour la variable centre.
    }
    public void translate(int dx,int dy){
        this.centre.translate(dx,dy);
    }
    public Point getCentre() {
        return new Point(centre);
    }
    public double area(){
        return 3.14 * (rayon^2);

    }
    public boolean contains(Point p){
        int deltaX = p.xGet()- getCentre().xGet();
        int deltaY = p.yGet()- getCentre().yGet();
        double sommeXY = deltaX^2 + deltaY^2;
        double rayonCarre= this.rayon^2;
        if(sommeXY <=rayonCarre){
            return true;

        }
        return false;
    }
    public boolean contains(Point p,Circle... circles){
        for (Circle cIt:
            circles ) {
            if(cIt.contains(p)){
               return true;
            }
        }
        return false;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public Circle getThis(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return rayon == circle.rayon && Objects.equals(getCentre(), circle.getCentre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon, getCentre());
    }




}