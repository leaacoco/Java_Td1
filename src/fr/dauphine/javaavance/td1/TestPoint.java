package fr.dauphine.javaavance.td1;

public class TestPoint {
    private Point p;

    public TestPoint(int x, int y) {
        this.p=new Point(x,y);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Point p=new Point();
        System.out.println(p.xGet() + " " + p.yGet());
    }

}



