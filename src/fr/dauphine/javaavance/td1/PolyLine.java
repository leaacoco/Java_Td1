package fr.dauphine.javaavance.td1;

import java.util.LinkedList;
import java.util.Objects;

public class PolyLine {
    private Point[] tableauPoint; //
    public LinkedList<Point> listePoints;

    public final int nombreMax;
    public int lastPosition = 0;
    public PolyLine(int nombreMax) {
        this.nombreMax = nombreMax;
        this.tableauPoint = new Point[this.nombreMax]; //[null,null]



    }
    public PolyLine(){
        this.nombreMax=-1;
        this.listePoints=new LinkedList<>();

    }

    public void add(Point p) {

        p = Objects.requireNonNull(p);//renvoi une exception si null
        if (this.nombreMax==-1){
            this.listePoints.add(p);
            this.lastPosition++;

        }
        else if (this.lastPosition + 1 <= this.nombreMax) {
            this.tableauPoint[this.lastPosition] = p;
            this.lastPosition++;

        } else {
            System.err.println("capacité dépassée");
        }
    }

    public int pointCapacity() {
        if(this.nombreMax==-1){
            return this.listePoints.size();
        }
        return this.nombreMax;
    }


    public int nbPoints() {
        return this.lastPosition + 1;
    }

       // Point p = null;
    public boolean contains(Point p) {
       /* for (int i = 0; i < this.nombreMax; i++) {
            Point pointI = this.tableauPoint[i];
            if (p.equals(pointI)) {
                return true;
            }

        }
        return false;
*/
        for (Point pointIt:
             this.tableauPoint) {
          //  Point pointit =

            if(pointIt == null)  continue;


            if(pointIt.equals(p)){ //p.equals(pointIt)/)
                return true;
            }
        }
        return false;
    }
}