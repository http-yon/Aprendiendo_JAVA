import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        String guillermo = JOptionPane.showInputDialog("ingrese la cantidad de dolares que tiene guillermo");
        
        double luis = Double.parseDouble(guillermo) / 2;
        double juan = (Double.parseDouble(guillermo) + luis) / 2;

        JOptionPane.showMessageDialog(null, "guillermo tiene : " + guillermo + " dolares");
        JOptionPane.showMessageDialog(null, "luis tiene : " + luis + " dolares");
        JOptionPane.showMessageDialog(null, "juan tiene : " + juan + " dolares");
        JOptionPane.showMessageDialog(null, "el total que tiene es de : " + (juan + Double.parseDouble(guillermo) + luis) + " dolares");

    }
}
