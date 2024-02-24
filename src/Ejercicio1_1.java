import javax.swing.JOptionPane;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "si es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "no es multiplo de 10");
        }
    }
}
