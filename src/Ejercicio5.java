import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {

        String participacionSt = JOptionPane.showInputDialog(null, "ingrese nota participacion");
        String primeraNotaParcialSt = JOptionPane.showInputDialog(null, "ingrese primera nota parcial");
        String segundaNotaParcialSt = JOptionPane.showInputDialog(null, "ingrese segunda nota parcial");
        String examenFinalSt = JOptionPane.showInputDialog(null, "ingrese nota examen final");

        double participacion = Double.parseDouble(participacionSt) * 0.10;
        double primeraNotaParcial = Double.parseDouble(primeraNotaParcialSt) * 0.25;
        double segundaNotaParcial = Double.parseDouble(segundaNotaParcialSt) * 0.25;
        double examenFinal = Double.parseDouble(examenFinalSt) * 0.40;

        double total = participacion + primeraNotaParcial + segundaNotaParcial + examenFinal;

        JOptionPane.showMessageDialog(null,"la nota total del estudiante es de: " + total );

    }
}
