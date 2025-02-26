/*
* Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Input Format

The first line contains an integer, , denoting the number of test cases.
Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

Output Format

For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.
Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
Explanation

 can be stored in a short, an int, or a long.

 is very large and is outside of the allowable range of values for the primitive data types
 * discussed in this problem.
 *
 * El problema consiste en verificar en qué tipo de dato primitivo de Java
 * se puede almacenar un número dado. Java tiene los siguientes tipos de datos numéricos enteros
 * con sus respectivos rangos:

Tipo	Bits	Rango
byte	8	-128 a 127
short	16	-32,768 a 32,767
int	32	-2,147,483,648 a 2,147,483,647
long	64	-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
Para cada número de entrada,
* debemos determinar en qué tipo de dato se puede almacenar sin causar desbordamiento (overflow).
* Si el número es demasiado grande y no cabe en ninguno de estos tipos,
* imprimimos que no se puede almacenar en ningún lugar.
*
* ✔ Leemos el número de pruebas T.
✔ Iteramos sobre cada número y tratamos de leerlo como long.
✔ Comprobamos en qué tipo de dato cabe (byte, short, int, long).
✔ Si el número es demasiado grande,
* capturamos la excepción y mostramos que no cabe en ningún tipo de dato.
✔ Imprimimos los tipos en los que cabe el número en orden ascendente.

Este método garantiza que los números se evalúan correctamente sin errores. 🚀*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  // Leer el número de casos de prueba

        for (int i = 0; i < T; i++) {
            try {
                long n = scanner.nextLong();  // Intentamos leer el número como 'long'

                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // Si el número es demasiado grande, 'scanner.nextLong()' lanza una excepción
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
