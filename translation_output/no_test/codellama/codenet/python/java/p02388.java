<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x = int(raw_input())
print x*x*x

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x * x * x);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read an integer value from the input. The `println()` method is used to print the result of the calculation to the console.</s>
