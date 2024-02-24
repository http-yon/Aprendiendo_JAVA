import javax.swing.JOptionPane;

public class CondicionalIfElse {
    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));

        //operador de desigualdad = !=
        //operador de mayor o igual = <=
        //operador de menor o igual = >=

        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "el numero es " + dato);
        }else{
            JOptionPane.showMessageDialog(null,"el numero es diferente al dato (" + numero + ")");
        }   
    }
}
