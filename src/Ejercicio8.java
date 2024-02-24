import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        String aSt = JOptionPane.showInputDialog(null,"ingrese valor de a");
        String bSt = JOptionPane.showInputDialog(null,"ingrese valor de b");
        String cSt = JOptionPane.showInputDialog(null,"ingrese valor de c");

        double a = Double.parseDouble(aSt);
        double b = Double.parseDouble(bSt);
        double c = Double.parseDouble(cSt);

        double x = Math.pow(b,2)-(4*(a*c));
        double x1 = (((b*(-1)) + (Math.sqrt(x))))/(2*a);
        double x2 = (((b*(-1)) - (Math.sqrt(x))))/(2*a);;
        //double totalOp1 = ((b*(-1)) + Math.sqrt(Math.pow(b,2)-(4*(a*c))))/(2*a);
        //double totalOp2 = ((b*(-1)) - Math.sqrt(Math.pow(b,2)-(4*(a*c))))/(2*a);
        //System.out.println((int)totalOp1);
        //System.out.println((int)totalOp2);
        System.out.println((int)x1);
        System.out.println((int)x2);



    }
}
