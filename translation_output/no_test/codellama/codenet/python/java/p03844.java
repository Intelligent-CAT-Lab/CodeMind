<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A,s,B = input().split()
A = int(A)
B = int(B)
if s == '+':
    print(A+B)
elif s == '-':
    print(A-B)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers and an operator (+, -, *, /): ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int A = Integer.parseInt(tokens[0]);
        int B = Integer.parseInt(tokens[1]);
        String operator = tokens[2];
        if (operator.equals("+")) {
            System.out.println(A + B);
        } else if (operator.equals("-")) {
            System.out.println(A - B);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into three parts: the two numbers and the operator. The `parseInt()` method is used to convert the strings to integers. Finally, the code uses an `if-else` statement to perform the appropriate calculation based on the operator.</s>
