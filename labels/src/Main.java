import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, FontFormatException {

        ImageIcon image = new ImageIcon("dog.png");

        // criando borda
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Dog pousando pra foto");
        label.setIcon(image);
        // posicionando elementos
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        // mudando cor do text
        label.setForeground(Color.green);

        // gap entre a foto e o texto
        label.setIconTextGap(-25);

        // mudando cor de fundo
        label.setBackground(Color.black);
        label.setOpaque(true); // mostra o backgroundColor

        // Escolhendo uma fonte padrão
         label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        // Minha propria fonte
        //Font myfont = Font.createFont(Font.TRUETYPE_FONT, new File("Poppins-Regular.ttf"));
        //label.setFont(myfont);

        // Definindo borda
        label.setBorder(border);

        // Alinhando elementos ao centro
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        MyFrame myFrame = new MyFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
        myFrame.add(label);

        // Posicionando elemento dentro do frame
        //label.setBounds(100, 100, 250, 250);
        //myFrame.setLayout(null);

        // Fazendo com que o frame tenha o mesmo
        // tamanho do conteúdo que está dentro dele
        // myFrame.pack(); // necessário remover: "setSize" do frame


    }

}