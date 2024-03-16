<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
if n==1:
    print('Hello World')
    exit()
a = int(input())
b = int(input())
print(a+b)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
            System.exit(0);
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `System.exit(0)` method is used to exit the program.</s>
