public class PrimitiveData {

    public static void main(String[] args){

        /*TIPOS DE VARIABLES (datos primitivos)*/

        //byte -> numeros enteros (entre -128 al 127)
        byte entero = 12;
        System.out.println("numero entero =" + entero);

        //short -> numeros enteros entre -32.768 a 32.767
        short entero2 =  32766;
        System.out.println("numero entero 2 =" + entero2);

        //int -> numeros enteros entre -2.147.483.648 a 2.147.483.647
        int entero3 = 1231231;
        System.out.println("numero entero 3 =" + entero3);

        //long -> numeros enteros muchos numeros jajaja
        long entero4 = 1323123123;
        System.out.println("numero entero 4 =" + entero4);


        //float -> numeros decimales
        float decimal = 3.45f; //poner la "f" para que sepa que es float
        System.out.println(decimal);

        //double -> mas numeros que float pero muy pesado
        double decimalLargo = 1.213123123123123;
        System.out.println(decimalLargo);


        //char -> variable de caracteres
        char caracter = 'a'; //solo usar los ''
        System.out.println(caracter);

        //boolean -> true o false
        boolean decision = true;
        System.out.println(decision);


    }
}