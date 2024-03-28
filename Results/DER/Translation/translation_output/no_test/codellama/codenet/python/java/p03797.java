<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s, c = map(int, input().split())

print(s + ((c-s*2)//4)) if s * 2 <= c else print(c//2)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();

        if (s * 2 <= c) {
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            System.out.println(c / 2);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `s` and `c`. It then uses the `if` statement to check if `s * 2` is less than or equal to `c`, and if so, it prints the result of the expression `s + ((c - s * 2) / 4)`. If `s * 2` is greater than `c`, it prints `c / 2`.</s>
