<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600307

```
a , b = input ( ) . split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        String reversedB = new StringBuilder(numbers[1]).reverse().toString();
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(reversedB);
        System.out.println(a + b);
    }
}
```

This Java code reads a line of input, splits it into two numbers, reverses the second number, and then adds the two numbers together. The result is printed to the console.

You can test this code with the provided test case by running it and inputting "35005211 521595368" when prompted. The expected output will be "898600307".
<|EOT|>
