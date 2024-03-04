import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        JOptionPane.showMessageDialog(null, "Olá, " + nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos de idade");

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + " de altura");

    }
}