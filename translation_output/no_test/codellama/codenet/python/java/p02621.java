<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a = int(input())
print(a + a ** 2 + a ** 3)

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
        System.out.println(a + a * a + a * a * a);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read an integer value from the user. The `System.out.println()` method is used to print the result of the calculation to the console.

Note that the `**` operator in Python is used to perform exponentiation, which is equivalent to the `Math.pow()` method in Java. The `Math.pow()` method takes two arguments: the base and the exponent. In this case, the base is `a`, and the exponent is `2` or `3`, depending on the desired calculation.</s>
