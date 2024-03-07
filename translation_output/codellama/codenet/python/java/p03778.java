<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

w, a, b = map(int, input().split())

if abs(a-b) < w:
    print(0)
else:
    print(abs(a-b) - w)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (Math.abs(a - b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a - b) - w);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.abs()` method is used to calculate the absolute value of a number.</s>
