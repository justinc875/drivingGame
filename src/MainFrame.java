import javax.swing.*;

public class MainFrame {
    public MainFrame() {
        JFrame frame = new JFrame("rhythmGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(462, 459);
        frame.setLocationRelativeTo(null);
        GraphicsPanel panel = new GraphicsPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
