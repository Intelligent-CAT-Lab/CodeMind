<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
a = (n+1)/2
print(int(a))

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
        int a = (n + 1) / 2;
        System.out.println(a);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value. The `a` variable is calculated using the formula `(n + 1) / 2`, and the result is printed to the console using the `println()` method.</s>
