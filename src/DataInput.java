import java.util.Scanner;

public class DataInput {
    public static void main(String[]args){
        /*entrada de datos - input*/


        //input para int
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("DIGITE UN NUMERO (int)");
        numero = entrada.nextInt();

        System.out.println("el numero es: " + numero);



        //input para float
        Scanner entrada2 = new Scanner(System.in);
        float numero2;

        System.out.println("DIGITE UN NUMERO (float)");
        numero2 = entrada2.nextFloat();

        System.out.println("el numero es: " + numero2);



        //input para double
        Scanner entrada3 = new Scanner(System.in);
        double numero3;

        System.out.println("DIGITE UN NUMERO (double)");
        numero3 = entrada3.nextDouble();

        System.out.println("el numero es: " + numero3);



        //input para string
        Scanner entrada4 = new Scanner(System.in);
        String cadena;

        System.out.println("ingrese texto a imprimir");
        cadena = entrada4.nextLine();

        System.out.println("texto: " + cadena);



        //input para char
        Scanner entrada5 = new Scanner(System.in);
        char cadena2;

        System.out.println("ingrese texto a imprimir");
        cadena2 = entrada5.next().charAt(0);


        System.out.println("texto: " + cadena2);
        




    }    
}