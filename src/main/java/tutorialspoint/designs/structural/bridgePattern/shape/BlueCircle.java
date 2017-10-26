package main.java.tutorialspoint.designs.structural.bridgePattern.shape;

/**
 * Created by rodicad on 26/10/2017.
 */
public class BlueCircle implements DrawAPI {
    @Override public void drawCircle( int x, int y, int radius ) {
        System.out.println("Drawing blue circle with (x,y)="+"("+x+","+y+")"+" and radius="+radius);

    }
}
