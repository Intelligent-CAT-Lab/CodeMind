<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')

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
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.abs()` method to calculate the absolute value of the difference between `x` and `a` or `b`. The `if` statement then checks which of the two values is closer to `x` and prints "A" or "B" accordingly.</s>
