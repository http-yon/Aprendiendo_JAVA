import javax.swing.JOptionPane;

public class CondicionalSwitch {
    public static void main(String[] args) {
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 1 y 5"));

        switch (dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "es numero 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "es numero 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "es numero 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "es numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "es numero 5");
                break;
            default:
                JOptionPane.showMessageDialog(null, "es otro numero (" + dato + ")");
                break;
        }

    }
}
