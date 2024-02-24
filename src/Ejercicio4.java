import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {

        String nombreEmpleado = JOptionPane.showInputDialog("nombre de empleado: ");
        String totalVendidosSt = JOptionPane.showInputDialog("total de carros vendidos");
        int totalVendidos = Integer.parseInt(totalVendidosSt);

        Double fivePercentperCar = 0.0;

        // para ingresar precio de cada carro
        for (int i = totalVendidos; i > 0; i--) {
            String totalCarroVendido = JOptionPane.showInputDialog("ingrese total del carro vendido");

            // saca el 5 porciento de cada venta
            fivePercentperCar = ((Double.parseDouble(totalCarroVendido) * 5) / 100) + fivePercentperCar;
        }

        JOptionPane.showMessageDialog(null, "NOMBRE: " + nombreEmpleado + "\n" + "SUELDO MENSUAL: "
                + ((totalVendidos * 150) + fivePercentperCar + 1000));

    }
}
