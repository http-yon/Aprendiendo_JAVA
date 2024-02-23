public class MathExamples {

    public static void main(String[] args) {
        
        //solo se puede usar con double


        //sacar raiz cuadrada
        double raiz = Math.sqrt(9);
        //guardar en variable tipo int
        int raizInt = (int)Math.sqrt(9);


        //elevar un numero a cierta potencia
        double base = 5, exponente = 2;

        double resultado = Math.pow(base,exponente);

        System.out.println(raiz);
        System.out.println(raizInt);
        System.out.println(resultado);


        //redondear un numero
        double numeroR = 4.56;
        long resultadoR = Math.round(numeroR);


        //numero random
        double numero = Math.random();


    }
}
