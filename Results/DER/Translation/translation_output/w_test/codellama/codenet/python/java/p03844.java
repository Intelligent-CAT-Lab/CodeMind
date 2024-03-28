<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 + 2

Expected output:
3


```
A,s,B = input().split()
A = int(A)
B = int(B)
if s == '+':
    print(A+B)
elif s == '-':
    print(A-B)

```
[/INST]
```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int A = Integer.parseInt(tokens[0]);
        int B = Integer.parseInt(tokens[2]);
        String operator = tokens[1];
        if (operator.equals("+")) {
            System.out.println(A + B);
        } else if (operator.equals("-")) {
            System.out.println(A - B);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into three parts: the first number, the operator, and the second number. It then converts the first two numbers to integers and the operator to a string, and uses an `if-else` statement to perform the appropriate calculation based on the operator. Finally, it prints the result to the console.

Note that this code assumes that the input will always be in the format "number operator number", and that the operator will always be either "+" or "-". If the input format or operator is different, the code will need to be modified accordingly.</s>
