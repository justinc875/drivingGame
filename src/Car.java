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
    private int topSpeed;
    private double acceleration;
    private String name;
    private int height;
    private int width;
    private Image img;
    private int x;
    private int y;
    //consider adding an arraylist to do all the upgrades

    public Car(int topSpeed, String name, double acceleration, int height, int width, int x, int y) {
        this.topSpeed = topSpeed;
        this.name = name;
        this.acceleration = acceleration;
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public void move() {


    }
}
