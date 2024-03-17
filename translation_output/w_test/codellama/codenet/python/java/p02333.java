<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
36


```
import math


def combination(i: int, j: int) -> int:
    return math.factorial(i) // math.factorial(i - j) // math.factorial(j)


if __name__ == "__main__":
    n, k = map(lambda x: int(x), input().split())
    modulo = 10 ** 9 + 7
    ans = 0
    if k <= n:
        for i in range(k):
            if 0 == i % 2:
                ans += (k - i) ** n * combination(k, i)
            else:
                ans -= (k - i) ** n * combination(k, i)
        ans = ans % modulo

    print(ans)


```
[/INST]
```java
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int modulo = 1000000007;
        int ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += (k - i) * combination(k, i);
                } else {
                    ans -= (k - i) * combination(k, i);
                }
            }
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static int combination(int n, int k) {
        int ans = 1;
        for (int i = 1; i <= k; i++) {
            ans *= n--;
            ans /= i;
        }
        return ans;
    }
}
```
This is the Java code for the given Python code. The `combination` function is implemented using the formula for combination, which is `n! / (k! * (n - k)!)`. The `main` function takes input from the user, calculates the answer using the `combination` function, and prints it.

Note that the `combination` function is implemented using a loop, which is more efficient than the recursive implementation in the Python code. Also, the `main` function uses the `Scanner` class to read input from the user, and the `System.out.println` method to print the answer.</s>
