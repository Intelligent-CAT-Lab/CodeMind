<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')

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
        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
        } else {
            System.out.println("Alice");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.abs()` method to calculate the absolute difference between `x` and `y`. If the absolute difference is less than or equal to 1, the code prints "Brown", otherwise it prints "Alice".</s>
