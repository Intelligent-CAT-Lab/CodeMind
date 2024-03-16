<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, k = map(int, input().split())
print(1 if n <= k else 0)


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
        System.out.println(n <= k ? 1 : 0);
    }
}
```

This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `n` and `k`. It then uses the ternary operator `? :` to print `1` if `n` is less than or equal to `k`, and `0` otherwise.</s>
