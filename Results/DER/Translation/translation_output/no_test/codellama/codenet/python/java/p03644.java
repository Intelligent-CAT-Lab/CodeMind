<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N = int(input())

ans, k = 1, 0
for i in range(2, N+1, 2):
    temp, res = i, 0
    while temp%2 == 0:
        res += 1
        temp //= 2
    if k < res:
        ans = i
        k = res
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
        int N = scanner.nextInt();

        int ans = 1;
        int k = 0;
        for (int i = 2; i <= N; i += 2) {
            int temp = i;
            int res = 0;
            while (temp % 2 == 0) {
                res++;
                temp /= 2;
            }
            if (k < res) {
                ans = i;
                k = res;
            }
        }
        System.out.println(ans);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `println()` method is used to print the result to the console.</s>
