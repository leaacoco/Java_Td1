package fr.dauphine.javaavance.td1;

import java.util.Objects;

public class Anneaux extends Circle {
    public int rayon2;
    public Anneaux(int rayon1,int rayon2,Point centre){
        super(centre,(Math.max(rayon1, rayon2)));
        this.rayon2=Math.min(rayon1, rayon2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Anneaux)) return false;
        Anneaux anneaux = (Anneaux) o;
        return rayon2 == anneaux.rayon2
                && anneaux.getRayon() == this.getRayon()
                && this.getCentre().equals(anneaux.getCentre()) ;
    }
     public String toString(){
        return super.toString() + " rayon2 "+  this.rayon2;
     }
     public boolean contains(Point p){
        return super.contains(p);

     }
     public boolean contains(Point p,Anneaux... anneaux) {
         for (Anneaux anneauxIt :
                 anneaux) {
             if (anneauxIt.contains(p)) {
                 return true;
             }

         }
         return false;
     }
}
