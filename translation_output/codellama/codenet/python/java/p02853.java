<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# A - DDCC Finals
x,y = map(int, input().split())
X = 0
Y = 0


if x == 3:
    X = 100000
elif x == 2:
    X = 200000
elif x == 1:
    X = 300000
else :
    X = 0

if y == 3:
    Y = 100000
elif y == 2:
    Y = 200000
elif y == 1:
    Y = 300000
else:
    Y = 0

if x == 1 and y == 1:
    print(X+Y+400000)
else:
    print(X +Y)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int X = 0;
        int Y = 0;

        if (x == 3) {
            X = 100000;
        } else if (x == 2) {
            X = 200000;
        } else if (x == 1) {
            X = 300000;
        }

        if (y == 3) {
            Y = 100000;
        } else if (y == 2) {
            Y = 200000;
        } else if (y == 1) {
            Y = 300000;
        }

        if (x == 1 && y == 1) {
            System.out.println(X + Y + 400000);
        } else {
            System.out.println(X + Y);
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `if` statements are similar to the Python code, but the syntax is slightly different.</s>
