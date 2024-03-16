<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `println()` method is used to print the output to the console.</s>
