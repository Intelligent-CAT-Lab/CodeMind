<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b, t = map(int, input().split())
print((t // a) * b)

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
        int t = scanner.nextInt();
        System.out.println((t / a) * b);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `/` operator to divide `t` by `a` and the `*` operator to multiply the result by `b`. Finally, it uses the `System.out.println()` method to print the result to the console.</s>
