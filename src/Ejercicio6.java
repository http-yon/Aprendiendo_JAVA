import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {

        String aSt = JOptionPane.showInputDialog(null,"ingrese valor de a");
        String bSt = JOptionPane.showInputDialog(null,"ingrese valor de b");

        double a = Double.parseDouble(aSt);
        double b = Double.parseDouble(bSt);

        double cuadrado = Math.pow((a+b),2);

        JOptionPane.showMessageDialog(null, "el cuadrado es: " + cuadrado);
        

    }
}
