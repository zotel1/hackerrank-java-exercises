/*
* The challenge here is to read  lines of input until you reach EOF,
* then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF;
* each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space,
* and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
*
* El objetivo del problema es leer un número desconocido de líneas desde la entrada estándar (System.in)
* hasta llegar al fin de archivo (EOF). Luego, debemos imprimir cada línea numerándola en orden.

📜 Conceptos clave
EOF (End Of File)

En la entrada estándar (System.in), EOF ocurre cuando ya no hay más datos que leer.
No podemos saber cuántas líneas hay de antemano, por lo que debemos leer hasta que no haya más datos.
Método Scanner.hasNext()

Permite verificar si hay más datos en la entrada.
Mientras haya datos disponibles, hasNext() devuelve true.
Cuando alcanzamos EOF, hasNext() devuelve false y terminamos la lectura.
🛠 Cómo resolver el problema
Crear un objeto Scanner para leer desde System.in.
Inicializar un contador para numerar las líneas.
Usar un bucle while con scanner.hasNextLine() para leer cada línea.
Imprimir el número de línea seguido del contenido de la línea.
Cerrar el Scanner después de leer todo.
*
* ❓ Preguntas frecuentes
🚀 ¿Por qué hasNextLine() en lugar de hasNext()?
hasNext() solo verifica si hay más datos en cualquier formato (palabra, número, etc.).
hasNextLine() verifica específicamente si hay una línea completa para leer.
🛑 ¿Cómo se simula EOF en la terminal?
En Windows: Usa Ctrl + Z y presiona Enter.
En Linux/macOS: Usa Ctrl + D.
🔥 ¿Qué pasa si hay líneas vacías?
scanner.nextLine() leerá la línea vacía y la imprimirá correctamente.
🏆 Resumen
✔ Leemos línea por línea hasta EOF usando scanner.hasNextLine().
✔ Imprimimos cada línea numerada.
✔ El programa funciona para cualquier cantidad de líneas.


*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un scanner para leer la entrada estándar
        int lineNumber = 1; // Contador de líneas

        while (scanner.hasNextLine()) { // Mientras haya más líneas para leer
            String line = scanner.nextLine(); // Leer la línea
            System.out.println(lineNumber + " " + line); // Imprimir número de línea y contenido
            lineNumber++; // Incrementar contador
        }

        scanner.close(); // Cerrar el scanner
    }
}
