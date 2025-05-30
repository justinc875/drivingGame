import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements ActionListener, KeyListener {
    //instance variables
    private BufferedImage background;
    private boolean[] pressedKeys;
    private Timer timer;
    private BufferedImage carImage;
    private Car car;

    //constructor
    public GraphicsPanel() {
        try {
            background = ImageIO.read(new File("src\\background.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //load the car picture
        try {
            carImage = ImageIO.read(new File("src\\car.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        pressedKeys = new boolean[128];
        addKeyListener(this);
        setFocusable(true); // this line of code + one below makes this panel active for keylistener events
        requestFocusInWindow();// see comment above

        Car npc = new NPC(120, "Green", 2.3, 200, 300, carImage);

    }
    
    //methods
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background!=null) {
            //g.drawImage(background, 0, 0, null);
            //g.setColor(Color.RED);
            //g.fillRect(50, 100, 100, 50);
            


        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // repaints the window every 10ms
        repaint();
    }


    @Override
    public void keyTyped(KeyEvent e) {
        int key = e.getKeyCode();
        pressedKeys[key] = true;
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }



}
