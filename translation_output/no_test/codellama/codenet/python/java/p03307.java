<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
if n % 2 == 0:
    print(n)
else:
    print(2 * n)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value. The `if` statement checks if the input is even, and if it is, it prints the input value. If the input is odd, it prints the double of the input value.</s>
