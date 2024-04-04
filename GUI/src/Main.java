import javax.swing.*;
import java.awt.*;

public class Main {

    // JFrame = uma janela GUI para adicionar components

    public static void main(String[] args) {

        new MyFrame();
        // ou
        // MyFrame myFrame = new MyFrame();
    }

    public static void frameExample(){
        JFrame frame = new JFrame(); // criando frame

        frame.setTitle("Título da Janela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
        frame.setSize(420, 420); // dimensão da janela
        frame.setVisible(true); // tornando frame visível

        /*
        JPEG, GIF (including animation and transparency),
        PNG, and XBM image formats.
         */
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());

        /*
            - getContentPane()
            É como se existisse uma capa sobre o frame,
            onde você adiciona os outros componentes (textfields, textareas, labels ete).
            Para você adicionar um componente desse nessa “capa”,
            você deve ter uma referência para este objeto (Container).
            você obter essa referência, você utiliza o método getContentPane().

            Container c = getContentPane().

            Aí você pode adicionar outros componentes nessa “capa” que fica sobre o Frame.
            c.add(jLabel);
            c.add(jtxtField);
         */

        // Modificando a cor de fundo do frame (Cores predefinidas)
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        // Modificando a cor de fundo do frame (Minha própria cor)
        frame.getContentPane().setBackground(new Color(150, 0, 255));

        // Modificando a cor de fundo do frame (Hexadecimal)
        frame.getContentPane().setBackground(new Color(0xAAFFFF));
    }

}