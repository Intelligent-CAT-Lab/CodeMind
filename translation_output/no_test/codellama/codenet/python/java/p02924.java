<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())

print((n-1)*n//2)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n-1)*n/2);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read an integer value from the user. The `System.out.println()` method is used to print the result to the console.

Note that the Python code uses the `input()` function to read input from the user, and the `print()` function to print the result to the console. In Java, we use the `Scanner` class to read input from the user, and the `System.out.println()` method to print the result to the console.</s>
