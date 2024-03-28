<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=map(int,input().split())
if a+b == 15:
    print('+')
elif a*b == 15:
    print('*')
else:
    print('x')

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
        if (a + b == 15) {
            System.out.println("+");
        } else if (a * b == 15) {
            System.out.println("*");
        } else {
            System.out.println("x");
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer from the input. The `System.out.println()` method is used to print output to the console.</s>
