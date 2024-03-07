<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c = map(int,input().split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')

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
        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            if (4 * a * b < (c - a - b) * (c - a - b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `if` statement is used to check if the condition is true, and the `else` statement is used to execute the code if the condition is false. The `System.out.println()` method is used to print the output to the console.</s>
