<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 6 6

Expected output:
3 10 -1 7 69

```
x1 , y1 , x2 , y2 = map ( int , input ( ) . split ( ) )
a = x2 - x1
b = y2 - y1
print ( x2 - b , y2 + a , x1 - b , y1 + a )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);

        int a = x2 - x1;
        int b = y2 - y1;

        System.out.println((x2 - b) + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, calculates the difference between the second and first pair of coordinates, and then prints the new coordinates.

Please note that in Java, we need to import the `java.util.Scanner` class to read input from the user. The `Scanner.nextLine()` method reads a line of input from the user, and the `split(" ")` method splits this line into an array of strings, each of which is a number. The `Integer.parseInt()` method converts each string to an integer.
<|EOT|>
