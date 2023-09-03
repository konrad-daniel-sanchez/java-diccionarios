/**
 * Programa que representa un registro de estudiantes utilizando un HashMap y realiza varias operaciones relacionadas con el mismo.
 *
 * Se importa la clase HashMap del paquete java.util, que se utilizará para crear una colección de pares clave-valor.
 *
 * Se crea un HashMap llamado estudiantes que almacenará información sobre los estudiantes.
 * La clave será el número de identificación del estudiante (una cadena de texto) y el valor será el nombre del estudiante (también una cadena de texto).
 *
 * Se agregan varios pares clave-valor al HashMap estudiantes, donde las claves son números de identificación y los valores son nombres de estudiantes.
 *
 * Se imprime la cantidad de estudiantes en el HashMap utilizando el método size(). Esto muestra cuántos estudiantes están registrados en la colección.
 *
 * Se imprime el nombre del estudiante con la identificación "222" utilizando el método get("222") para buscar y recuperar el valor asociado a esa clave.
 *
 * Se realiza una comprobación para verificar si el HashMap estudiantes contiene la clave "1000" utilizando el método containsKey("1000"). Si la clave existe, se imprime el valor asociado a esa clave; de lo contrario, se muestra un mensaje que indica que no existe un estudiante con el identificador "1000".
 *
 * En resumen, este programa crea un registro de estudiantes utilizando un HashMap, permite consultar la cantidad de estudiantes, buscar estudiantes por identificación y manejar la situación en la que la identificación de un estudiante no existe en el registro.
 */

import java.util.HashMap;

public class Estudiantes {
    public static void main(String[] args) {
        HashMap<String, String> estudiantes = new HashMap<>();

        estudiantes.put("777", "Bart Simpson");
        estudiantes.put("222", "Lisa Simpson");
        estudiantes.put("333", "Nelson Muntz");
        estudiantes.put("41", "Milhouse Van Houten");
        estudiantes.put("9", "Rafa Gorgory");

        // Se imprime la cantidad de estudiantes:
        System.out.println(estudiantes.size());

        // Se imprime el estudiante con la identificación "222":
        System.out.println(estudiantes.get("222"));

        if(estudiantes.containsKey("1000"))
            System.out.println(estudiantes.get("1000"));
        else
            System.out.println("No existe un estudiante con el identificador '1000'");
    }
}
