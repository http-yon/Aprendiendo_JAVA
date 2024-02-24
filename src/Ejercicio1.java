import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        double total = 0;

        for (int i = 0; i < 3; i++) {
            String inputSt = JOptionPane.showInputDialog(null, "inggrese calificacion " + (i + 1));
            total = Double.parseDouble(inputSt) + total;
        }

        JOptionPane.showMessageDialog(null, "el total de la calificaciones es: " + (int) total);

    }
}
