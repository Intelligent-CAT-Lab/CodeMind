<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b, c = map(int, input().split())

if a < b:
    if c < a:
        print(c, b)
    elif b < c:
        print(a, c)
    else:
        print(a, b)
else:
    if c < b:
        print(c, a)
    elif a < c:
        print(b, c)
    else:
        print(b, a)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b) {
            if (c < a) {
                System.out.println(c + " " + b);
            } else if (b < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            if (c < b) {
                System.out.println(c + " " + a);
            } else if (a < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print output to the console.</s>
