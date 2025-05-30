import java.util.ArrayList;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NPC extends Car{

    //instances
    private int laneNumber;
    private BufferedImage img;
    private int x;
    private int y;
    private int speed;
    private int lane;

    public NPC(int topSpeed, String name, double acceleration, int x, int y, BufferedImage image) {
        super(topSpeed, name, acceleration, x, y, image);
        this.lane = lane;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLane() {
        return lane;
    }

    //use a timer to generate cars, the maximum time that is allowed to tick should be the minimmum speed of the car

    private int generateLane () {
        //if there are more than 3 cars in a lane than make it so you cant generate any car in that lane anymkore
        //placeholder
        return (int) (Math.random() * 4) + 1;
    }




}
