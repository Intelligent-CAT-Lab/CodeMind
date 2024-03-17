<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
8


```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
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
This code uses the `Scanner` class to read input from the user, and the `pow` method to calculate the power of `m` to the power of `n` modulo `mod`. The `pow` method uses a loop to calculate the result, and it returns the result modulo `mod`.

The `main` method first reads the input from the user using the `Scanner` class, and then it calls the `pow` method to calculate the result. Finally, it prints the result to the console.

Note that the `pow` method is a recursive method, and it uses a loop to calculate the result. This method is more efficient than using a recursive method, because it avoids the overhead of function calls.</s>
