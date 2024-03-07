<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b = map(int, input().split())
c = a * b
if c % 2 == 1:
    print('Odd')
else:
    print('Even')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;
        if (c % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. The `a` and `b` variables are then multiplied together to get the product `c`. The `c % 2` expression is used to check if `c` is odd or even, and the `if` statement is used to print the appropriate message.</s>
