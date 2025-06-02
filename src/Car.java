import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


//use the api from google to determine the stats and the possible upgrades

public class Car {

    //instance
    private final int moveAmt = 3;
    private int topSpeed;
    private double acceleration;
    private String name;
    private Image img;
    private int x;
    private int y;
    private BufferedImage image;
    private double deceleration;
    public double idleSpeed;
    //consider adding an arraylist to do all the upgrades

    public Car(int topSpeed, double idleSpeed, double deceleration, String name, double acceleration, int x, int y, BufferedImage image) {
        this.topSpeed = topSpeed;
        this.name = name;
        this.acceleration = acceleration;
        this.x = x;
        this.y = y;
        this.image = image;
        this.deceleration = deceleration;
        this.idleSpeed = idleSpeed;
    }

    public void move() {

    }

    public int getX () {
        return x;
    }

    public int getY() {
        return y;
    }

    public void faceRight() {
        //logic to move the car right slowing, cycle thorugh the images using a timer
    }

    public void faceLeft() {

    }
    public BufferedImage getPlayerImage() {
        return image;
    }

    public Rectangle carRect() {
        int imageHeight = getPlayerImage().getHeight();
        int imageWidth = getPlayerImage().getWidth();
        Rectangle rect = new Rectangle(x, y, imageWidth, imageHeight);
        return rect;
    }

    public int getTopSpeed () {
        return topSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getDeceleration() {
        return deceleration;
    }

    public double getIdleSpeed() {
        return idleSpeed;
    }
}
