<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c,d = map(int, input().split())
s = a*b
t = c*d
if s > t: print(s)
else: print(t)

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
        int d = scanner.nextInt();
        int s = a * b;
        int t = c * d;
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. It then calculates the product of the two numbers and prints the result.

Note that the `Scanner` class is part of the `java.util` package, so you need to import it at the beginning of the file.</s>
