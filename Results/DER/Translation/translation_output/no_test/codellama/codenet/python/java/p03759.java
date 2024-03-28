<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c=map(int,input().split())
if b-a==c-b:
  print('YES')
else:
  print('NO')

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
        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. The `if` statement checks if the difference between `b` and `a` is equal to the difference between `c` and `b`, and if so, it prints "YES" to the console. Otherwise, it prints "NO".</s>
