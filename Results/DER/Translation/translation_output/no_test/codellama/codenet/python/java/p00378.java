<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A, B, X = map(int, input().split())
k = (X // 1000)
ans = k * min(A, 2*B)
r = X - 1000*k
if 0 < r <= 500:
    ans += min(A, B)
elif 500 < r:
    ans += min(A, 2*B)
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = scanner.nextInt();
        int k = X / 1000;
        int ans = k * Math.min(A, 2 * B);
        int r = X - 1000 * k;
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (500 < r) {
            ans += Math.min(A, 2 * B);
        }
        System.out.println(ans);
    }
}
```
Note that in Java, we use the `Math.min()` method to find the minimum of two numbers, and we use the `/` operator to perform integer division.</s>
