<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N = int(input())
print(800*N-200*(N//15))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(800 * N - 200 * (N / 15));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value. The `println()` method is used to print the result to the console.

Note that the Python code uses the `//` operator to perform integer division, which returns the integer part of the result. In Java, you can use the `int` function to perform integer division, like this: `N / 15`. This will return the integer part of the result, which is equivalent to the Python code.</s>
