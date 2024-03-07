<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, p = list(map(int, input().split()))
print((3*a+p)//2)

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
        int p = scanner.nextInt();
        int result = (3 * a + p) / 2;
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. The `result` variable is calculated using the formula `(3 * a + p) / 2`, and then printed to the console using the `System.out.println()` method.</s>
