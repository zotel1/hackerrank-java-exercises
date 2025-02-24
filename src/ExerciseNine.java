/*Objective
In this challenge,
we're going to use loops to help us do some simple math.

Task
Given an integer,
, print its first multiples. Each multiple  (where ) should be printed on a new line in the form: .N x i = result

Input Format

A single integer, .

Constraints

Output Format

Print lines of output;
each line (where ) contains the  of  in the form:
.N x i = result

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

- En este ejemplo dejamos de usar Scanner para usar BufferedReader,
este ultimo es mas veloz que Scanner.
- Convertimos un String en un int.
- Usamos un bucle for para generar una tabla de multiplicar.
- Imprimimos los valores en un formato específico*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // Creamos un BufferedReader para leer la entrada estándar
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Leer el número entero N desde la entrada estándar
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Cerramos el BufferedReader
        bufferedReader.close();

        // Iteramos desde 1 hasta 10 para imprimir la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            int result = N * i; // Calculamos el resultado de la multiplicación
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}