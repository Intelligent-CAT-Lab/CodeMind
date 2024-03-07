<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x, y = map(int, input().split())
abs_x = abs(x)
abs_y = abs(y)

if 0 <= x < y:
    print (y - x)
    exit()
if 0 < y < x:
    print (x - y + 2)
    exit()
if y == 0 and 0 < x:
    print (x + 1)
    exit()

if x < y <= 0:
    print (y - x)
    exit()
if y < x < 0:
    print (x - y + 2)
    exit()
if x == 0 and y < 0:
    print (abs_y + 1)
    
if x < 0  < y:
    print (abs(abs_y - abs_x) + 1)
    exit()
if y < 0 < x:
    print (abs(abs_y - abs_x) + 1)
    exit()




Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int absX = Math.abs(x);
        int absY = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
            return;
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            return;
        }
        if (y == 0 && 0 < x) {
            System.out.println(x + 1);
            return;
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            return;
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            return;
        }
        if (x == 0 && y < 0) {
            System.out.println(absY + 1);
            return;
        }

        if (x < 0 && 0 < y) {
            System.out.println(abs(absY - absX) + 1);
            return;
        }
        if (y < 0 && 0 < x) {
            System.out.println(abs(absY - absX) + 1);
            return;
        }
    }
}
```
Note that the `abs` function in Java is used to get the absolute value of a number, and the `Math.abs` function is used to get the absolute value of a number.

Also, the `return` statement is used to exit the function and return the result to the caller.

The `Scanner` class is used to read input from the user, and the `nextInt` method is used to read an integer from the user.

The `System.out.println` method is used to print the result to the console.</s>
