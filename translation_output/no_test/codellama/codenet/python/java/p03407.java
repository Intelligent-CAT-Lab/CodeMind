<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A, B, C = map(int, input().split())

if A + B < C:
    print("No")
else:
    print("Yes")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. The `if` statement checks if the sum of `A` and `B` is less than `C`, and if it is, it prints "No", otherwise it prints "Yes".</s>
