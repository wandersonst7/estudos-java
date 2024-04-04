import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Título da Janela");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.getContentPane().setBackground(new Color(150, 0, 255));
    }

}
