<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
814793613347395 1.99

Expected output:
1621439290561408

```
a , b = input ( ) . split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        String b = splitInput[1].charAt(0) + splitInput[1].substring(2);
        int a = Integer.parseInt(splitInput[0]);
        int result = (a * Integer.parseInt(b)) / 100;
        System.out.println(result);
    }
}
```

This Java code reads a line of input, splits it into two parts based on the space character, and then converts the first part to an integer. It then takes the second part, removes the decimal point, and converts it to an integer. It then multiplies the two integers together and divides by 100 to get the final result. The result is then printed to the console.
<|EOT|>
