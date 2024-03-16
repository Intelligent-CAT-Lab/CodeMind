<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,k = map(int, input().split())
if k > n:
    print(0)
    quit()
ans = 1
for i in range(1,k):
    ans *= n-i
    ans //= i
ans %= 1000000007
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k > n) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 1; i <= k; i++) {
            ans *= n - i;
            ans /= i;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
```
Note that in Java, we use `long` instead of `int` to handle large numbers, and we use the `%` operator to get the remainder of the division. Also, we use `return` to exit the function instead of `quit()`.</s>
