<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,k=map(int,input().split())
print(k*(k-1)**(n-1))

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
        int k = scanner.nextInt();
        System.out.println(k * (k - 1) ** (n - 1));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of `k - 1` to the `n - 1` power. The `System.out.println()` method is used to print the result to the console.</s>
