<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(Math.ceil(h / a));
    }
}

The code first imports the necessary libraries, including the Scanner class for reading input and the Math class for performing mathematical operations.

The main method then creates a new Scanner object called sc, which is used to read input from the user. The user is prompted to enter two integers, h and a, separated by a space. The sc.nextInt() method is used to read the first integer, and the sc.nextInt() method is used to read the second integer.

The code then uses the Math.ceil() method to calculate the ceiling of h/a, which is the smallest integer greater than or equal to h/a. The result is then printed to the console using the System.out.println() method.

Note that the Python code uses the map() function to convert the input string to a list of integers, but this is not necessary in Java because the Scanner class can directly read integers from the input stream.</s>
