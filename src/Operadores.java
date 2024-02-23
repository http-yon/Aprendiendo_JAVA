import java.util.Scanner;

public class Operadores {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        float num1, num2, suma, resta, mult, div, resto;

        System.out.println("digite 2 numeros");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;

        System.out.println("SUMA: " + suma);
        System.out.println("RESTA: " + resta);
        System.out.println("MULTIPLICACION: " + mult);
        System.out.println("DIVISION: " + div);
        System.out.println("RESTO: " + resto);

        



        

        
    }
}
