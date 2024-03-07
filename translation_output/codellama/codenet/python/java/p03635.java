<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, m = map(int, input().split())
print((n-1)*(m-1))

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
        int m = scanner.nextInt();
        System.out.println((n-1)*(m-1));
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it calculates the result using the formula `(n-1)*(m-1)`. Finally, it prints the result to the console.</s>
