<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int mod = 1000000007;
        System.out.println(pow(m, n, mod));
    }

    public static int pow(int m, int n, int mod) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * m) % mod;
        }
        return result;
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `pow` method to calculate the power of `m` to the power of `n` modulo `mod`. The `pow` method is a simple implementation of the modular exponentiation algorithm.

Note that the `pow` method is not a built-in method in Java, so you need to define it yourself.</s>
