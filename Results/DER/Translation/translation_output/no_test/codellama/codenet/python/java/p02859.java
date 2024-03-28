<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

r = int(input())
print(r**2)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println(r * r);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read an integer value from the user. The `r * r` expression calculates the square of the input value, and the `System.out.println()` method is used to print the result to the console.</s>
