/**
 * Programa de traducción de números que permite al usuario ingresar un número en español y muestra su traducción correspondiente en inglés.
 *
 * Se crea un objeto Scanner llamado lector para leer la entrada del usuario desde la consola.
 *
 * Se define un diccionario (en este caso, un HashMap) llamado numerosTraducidos que almacena las traducciones de números en español e inglés. Cada número en español es una clave, y su traducción en inglés es el valor asociado.
 *
 * El programa muestra un mensaje en la consola solicitando al usuario que ingrese un número en español utilizando System.out.print.
 *
 * Se utiliza lector.next() para capturar la entrada del usuario y almacenarla en la variable numeroEspanol.
 *
 * Se busca la traducción del número ingresado en el diccionario numerosTraducidos utilizando numerosTraducidos.get(numeroEspanol). Si la traducción existe (es decir, si el valor no es null), se muestra en inglés utilizando System.out.println.
 *
 * Si no se encuentra una traducción para el número ingresado (cuando traduccion es null), se muestra un mensaje que indica que no se encontró una traducción.
 *
 * */

import java.util.HashMap;
import java.util.Scanner;

public class TraductorDeNumeros {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Definir un diccionario (HashMap) con las traducciones
        HashMap<String, String> numerosTraducidos = new HashMap<>();
        numerosTraducidos.put("uno", "one");
        numerosTraducidos.put("dos", "two");
        numerosTraducidos.put("tres", "three");
        numerosTraducidos.put("cuatro", "four");
        numerosTraducidos.put("cinco", "five");
        numerosTraducidos.put("seis", "six");
        numerosTraducidos.put("siete", "seven");
        numerosTraducidos.put("ocho", "eight");
        numerosTraducidos.put("nueve", "nine");
        numerosTraducidos.put("diez", "ten");

        // Mostrar un mensaje solicitando al usuario que ingrese un número en español
        System.out.print("Ingresa el número en español a traducir:");
        String numeroEspanol = lector.next();

        // Buscar la traducción en el diccionario y mostrarla
        String traduccion = numerosTraducidos.get(numeroEspanol);
        if (traduccion != null) {
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("No se encontró una traducción para '" + numeroEspanol + "'.");
        }
    }
}
