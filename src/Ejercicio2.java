import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        String horasSt  = JOptionPane.showInputDialog(null,"ingrese horas trabajadas esta semana");
        String salarioSt = JOptionPane.showInputDialog(null, "ingrese salario x hora");
        
        double totalSalarioSemanal = Double.parseDouble(salarioSt) * Double.parseDouble(horasSt);


        JOptionPane.showMessageDialog(null, "el total de salario de esta semana es de: " + totalSalarioSemanal);
 
    }
}
