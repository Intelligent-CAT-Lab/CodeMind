<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = input ( ) . split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        String reversedB = new StringBuilder(splitInput[1]).reverse().toString();
        int b = Integer.parseInt(reversedB);
        int a = Integer.parseInt(splitInput[0]);
        System.out.println(a + b);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into two parts, reverses the second part, converts both parts to integers, and then prints the sum of the two integers.
<|EOT|>
