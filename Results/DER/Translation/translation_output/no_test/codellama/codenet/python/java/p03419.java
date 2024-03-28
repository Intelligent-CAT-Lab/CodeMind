<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, m = map(int, input().split())
if n == 1 or m == 1:
    print(1 if n * m == 1 else max(n, m) - 2)
else:
    print((n - 2) * (m - 2))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == 1 || m == 1) {
            System.out.println(1);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the result to the console.</s>
