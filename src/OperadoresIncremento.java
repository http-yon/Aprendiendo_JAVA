/**
 * OperadoresIncremento
 */
public class OperadoresIncremento {

    public static void main(String[]args){
        int x = 5, y;

        //incremento
        x++; // x = x+1

        //decremento
        x--; // x = x-1 

        //tener en cuenta como asignas 
        y = x++; //primero asigna y luego aumenta
        y = ++x; //primero aumenta y luego asigna                   

        System.out.println(x);
    }
}