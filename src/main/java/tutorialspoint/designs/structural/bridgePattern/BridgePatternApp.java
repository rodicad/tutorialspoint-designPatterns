package main.java.tutorialspoint.designs.structural.bridgePattern;

import main.java.tutorialspoint.designs.structural.bridgePattern.shape.BlueCircle;
import main.java.tutorialspoint.designs.structural.bridgePattern.shape.Circle;
import main.java.tutorialspoint.designs.structural.bridgePattern.shape.RedCircle;
import main.java.tutorialspoint.designs.structural.bridgePattern.shape.Shape;

/**
 * Created by rodicad on 26/10/2017.
 */
public class BridgePatternApp {

    public static void main(String[] args) {
        Shape circle = new Circle( 10,12,5, new RedCircle() );
        Shape blueCircle = new Circle( 10,12,5, new BlueCircle() );

        circle.draw();
        blueCircle.draw();
    }
}
