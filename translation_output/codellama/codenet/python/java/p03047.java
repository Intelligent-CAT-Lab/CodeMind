<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N,K = map(int,input().split())

print(N-(K-1))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(N - (K - 1));
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `N` and `K`. It then calculates the result using the formula `N - (K - 1)` and prints it to the console using the `System.out.println()` method.</s>
