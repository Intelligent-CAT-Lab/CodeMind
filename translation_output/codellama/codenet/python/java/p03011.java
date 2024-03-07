<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))

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
        int c = scanner.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println(a + b + c - max);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.max()` method to find the maximum of three numbers. The `System.out.println()` method is used to print the result to the console.</s>
