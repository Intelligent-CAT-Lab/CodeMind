<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c=map(int,input().split())
if a<c<b or a>c>b:
  print('Yes')
else:
  print('No')

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
        if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as integers. It then uses the `if` statement to check if the condition is true, and prints "Yes" or "No" accordingly.</s>
