<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a , b , c , d = map ( int , input ( ) . split ( ) )
print ( max ( 0 , min ( b , d ) - max ( a , c ) ) )


```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        System.out.println(Math.max(0, Math.min(b, d) - Math.max(a, c)));
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and assigns them to variables `a`, `b`, `c`, and `d`. Then it calculates and prints the maximum of `0` and the difference between the minimum of `b` and `d` and the maximum of `a` and `c`.
<|EOT|>
