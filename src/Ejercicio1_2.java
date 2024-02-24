import javax.swing.JOptionPane;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 1")),
                n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 2"));

        if (n1 != n2) {

            if (n1 > n2) {
                JOptionPane.showMessageDialog(null, "NUMERO MAYOR: " + n1);
            } else {
                JOptionPane.showMessageDialog(null, "NUEMRO MAYOR: " + n2);
            }

        } else {
            JOptionPane.showMessageDialog(null, "son iguales");
        }

    }
}
