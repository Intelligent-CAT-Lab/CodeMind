<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=map(int,input().split())
print(0 if a<b else 10)

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
        if (a < b) {
            System.out.println(0);
        } else {
            System.out.println(10);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers. It then uses an `if` statement to check if the first integer is less than the second integer, and if it is, it prints `0`, otherwise it prints `10`.</s>
