<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = input ( ) . split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        String b = splitInput[0].charAt(0) + splitInput[1];
        int a = Integer.parseInt(splitInput[0]);
        int c = Integer.parseInt(b);
        System.out.println(a * c / 100);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a line of input, splits it into two parts, converts the first part to an integer, and the second part to an integer by taking the first character of the second part and appending the rest of the second part, then it prints the product of the two integers divided by 100.
<|EOT|>
