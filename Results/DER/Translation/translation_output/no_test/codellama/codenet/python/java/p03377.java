<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,x = map(int, input().split())
print('YES' if a<=x and a+b>=x else 'NO')

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
        int x = scanner.nextInt();
        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as an integer. The `if` statement checks whether the condition `a <= x && a + b >= x` is true, and if it is, it prints "YES" to the console. If the condition is false, it prints "NO" to the console.</s>
