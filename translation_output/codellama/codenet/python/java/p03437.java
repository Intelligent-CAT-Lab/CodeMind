<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x,y=map(int,input().split())
print(x if x%y else -1)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x % y == 0) {
            System.out.println(x);
        } else {
            System.out.println(-1);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `%` operator to check if `x` is divisible by `y`. If it is, it prints `x`, otherwise it prints `-1`.</s>
