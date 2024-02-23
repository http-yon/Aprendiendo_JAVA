import javax.swing.JOptionPane;

/**
 * DataInputJOption
 */
public class DataInputJOption {

    public static void main(String[]args){
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entero"));
        letra = JOptionPane.showInputDialog("digite una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un numero decimal"));

        JOptionPane.showMessageDialog(null, "la cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "el entero es: " + entero);
        JOptionPane.showMessageDialog(null, "la letra es: " + letra);
        JOptionPane.showMessageDialog(null, "el decimal es: " + decimal);

    }
}