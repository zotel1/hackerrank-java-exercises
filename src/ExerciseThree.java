/*In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Wikipedia if-else flow chart

Source: Wikipedia

        Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

        Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

        3
Sample Output 0

Weird
Sample Input 1

        24
Sample Output 1

Not Weird
Explanation

Sample Case 0:
is odd and odd numbers are weird, so we print Weird.

Sample Case 1:
and  is even, so it isn't weird. Thus, we print Not Weird. este es el link https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true */

// Para resolver este ejercicio tenemos que leer N usando BufferedReader, que es más eficiente que Scanner.
//despues cerramos el bufferedReader después de leer la entrada.
//y por ultimo agregamos la estructura if-else para verificar las condiciones según el enunciado.

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        // Implementamos la lógica de if-else
        if (N % 2 != 0) { // Es impar
            System.out.println("Weird");
        } else { // Es par
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else { // N > 20
                System.out.println("Not Weird");
            }
        }
    }
}
