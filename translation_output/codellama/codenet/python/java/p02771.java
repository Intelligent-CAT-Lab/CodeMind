<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c = map(int,input().split())
if a == b and b != c:
  print("Yes")
elif b == c and a != b:
  print("Yes")
elif a == c and a != b:
  print("Yes")
else:
  print("No")

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

        if (a == b && b != c) {
            System.out.println("Yes");
        } else if (b == c && a != b) {
            System.out.println("Yes");
        } else if (a == c && a != b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `println()` method is used to print the output to the console.</s>
