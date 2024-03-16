<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# coding: utf-8
D, N = map(int, input().split())
print(100 ** D * N if N != 100 else 100 ** D * (N + 1))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(100 * D * N);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the values of `D` and `N`. The `System.out.println()` method is used to print the result to the console.

Note that the `100 * D * N` expression is equivalent to the `100 ** D * N` expression in Python, which raises the number 100 to the power of `D` and then multiplies it by `N`.</s>
