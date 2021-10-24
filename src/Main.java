import fr.dauphine.javaavance.td1.Anneaux;
import fr.dauphine.javaavance.td1.Circle;
import fr.dauphine.javaavance.td1.Point;
import fr.dauphine.javaavance.td1.PolyLine;
import view.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Avanc´e - Graphic Display");
        frame.setSize(new Dimension(500, 500));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CircleView cercle1= new CircleView(new Circle(new Point(100,100),500));
        MyDisplay d = new MyDisplay(cercle1);

        AnneauxView anneauxView=new AnneauxView(new Anneaux(1000,200, new Point(100,200)));
        PolyLine polyLine = new PolyLine();
        polyLine.add(new Point(600,400));
        polyLine.add(new Point(300,500));
        polyLine.add(new Point(700,900));

        PolyLineView polyLineView=new PolyLineView(polyLine);
        ArrayList<ShapeView> shapeViews= new ArrayList<>();
        shapeViews.add(polyLineView);
        shapeViews.add(cercle1);
        shapeViews.add(anneauxView);
        MyDisplay myDisplay=new MyDisplay(shapeViews);


        frame.add(myDisplay);



    }
}

