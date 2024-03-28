<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y != 0:
  x, y = y, x % y
print(y)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two integers: ");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }
    while (x % y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }
    System.out.println("The GCD of " + x + " and " + y + " is " + y);
  }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the two integers. It then uses the `if` statement to swap the values of `x` and `y` if `x` is greater than `y`. The `while` loop continues until `x % y` is equal to 0, at which point the GCD is found and printed to the console.</s>
