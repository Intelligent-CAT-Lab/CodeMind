<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
t , h = map ( int , input ( ) . split ( ) )
print ( ( h - 2 ) // ( t - 1 ) + 1 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int t = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the result as `(h - 2) / (t - 1) + 1` and prints the result. The `//` operator in Python is equivalent to `/` in Java for integer division.
<|EOT|>
