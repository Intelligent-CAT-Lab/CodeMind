<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,i=map(int,input().split())
print(n+1-i)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        System.out.println(n + 1 - i);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as an integer. The `println()` method is used to print the result to the console.</s>
