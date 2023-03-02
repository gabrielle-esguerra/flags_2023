import ecs100.*;
import java.awt.Color;
/**
 * Class demonstration to draw a lolipop for our first GUI
 *
 * @author Gabrielle
 * @version 2/3/23
 */
public class drawLollipop
{
    // instance variables 
    public drawLollipop() {
        UI.initialise(); // Bring up ecs100 canvas
        UI.addButton("Draw", this::drawLollipops);
        UI.addButton("Quit", UI::quit);
    }
    
    /**
     * Draw a lollipop
     */
    public void doDrawLollipop(double x, double y, double size, double stick ) {
        double left = x-size/2.0; // left most pos of object
        double top = y-size/2.0; // top most pos of object
        double bottom = y+stick; // botton most pos of stick
        
        final int STICKWIDTH = 5;
        final int LOLLYWIDTH = 1;
        
        // Draw the sticks
        UI.setLineWidth(STICKWIDTH);
        UI.setColor(Color.black);
        UI.drawLine(x, y, x, bottom);
        
        // Draw the red lolly
        UI.setLineWidth(LOLLYWIDTH);
        UI.setColor(Color.red);
        UI.fillOval(left, top, size, size);
    }
    
    /**
     * Calls the doDrawLollipop method with a number of different parameters
     */
    public void drawLollipops() {
        doDrawLollipop(300,180,80, 200);
        doDrawLollipop(100,50 ,20, 20);
        doDrawLollipop(200,100,50, 100);
        doDrawLollipop(400,150,30, 50);
    }
}
