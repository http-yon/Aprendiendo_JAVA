import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {

        String horasSt = JOptionPane.showInputDialog(null,"ingrese el total de horas");
        double horas = Double.parseDouble(horasSt);

        JOptionPane.showMessageDialog(null,"el total de semanas es: " + (int)((horas / 24) / 7)); //semanas
        JOptionPane.showMessageDialog(null, "el total de dias es: " + (int)((horas /24) % 7)); //dias
        JOptionPane.showMessageDialog(null, "el total de horas es: " + (int)(horas % 24) ); //horas

    }
}
