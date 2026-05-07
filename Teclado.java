
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Teclado{
    public static void main(String [] args){
        ArrayList<Character> palabra = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        boolean fin = false;
        
        while( fin == false){
            System.out.println("introduce el numero");
            String combinacion = sc.nextLine();
             if(combinacion.equals("fin")){
                fin = true;
                break; 
            }
            int [] transformado = pasarNumerico(combinacion);
            char letra = interaccionTeclado(transformado);
            System.out.println(letra);
            palabra.add(letra);
           
        }
         System.out.println(palabra);
    }
       
    


    public static  char interaccionTeclado(int[] numeros){
       char[][] teclado = {
        {'A', 'B', 'C'},
        {'D', 'E', 'F'},
        {'G', 'H', 'I'},
        {'J', 'K', 'L'},
        {'M', 'N', 'O'},
        {'P', 'R', 'S'},
        {'T', 'U', 'V'},
        {'W', 'X', 'Y', 'Z'}
        };
        int primerNumero = numeros[0];
        char letra = teclado[primerNumero-1][numeros.length - 1];
        return letra;
        
    
    


    }

    public  static int[] pasarNumerico(String combinación){
         String [] numeros = combinación.split(",");
        int [] array = new int[numeros.length];
        for( int i = 0 ; i < numeros.length ; i++){
            array[i] = Integer.parseInt(numeros[i]);
        }
        return array;
    }
}
