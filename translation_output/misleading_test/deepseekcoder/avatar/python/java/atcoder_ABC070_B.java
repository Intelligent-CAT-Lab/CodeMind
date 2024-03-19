<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
-37

```
a , b , c , d = map ( int , input ( ) . split ( ) )
print ( max ( 0 , min ( b , d ) - max ( a , c ) ) )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int result = Math.max(0, Math.min(b, d) - Math.max(a, c));
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, calculates the difference between the maximum and minimum of the last two numbers, and then subtracts the maximum of the first two numbers from this difference. The result is then printed to the console.
<|EOT|>
