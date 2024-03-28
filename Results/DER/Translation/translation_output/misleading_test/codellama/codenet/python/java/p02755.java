<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
43

```
A, B = map(int, input().split())
f = False
ans = 0
n = A * 100 // 8
m = (A + 1) * 100 // 8
for i in range(n, m + 1):
  if i * 8 // 100 == A and i // 10 == B:
    f = True
    ans = i
    break
print(ans if f else -1)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = A * 100 / 8;
        int m = (A + 1) * 100 / 8;
        boolean f = false;
        int ans = 0;
        for (int i = n; i <= m; i++) {
            if (i * 8 / 100 == A && i / 10 == B) {
                f = true;
                ans = i;
                break;
            }
        }
        System.out.println(f ? ans : -1);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. It then uses a `for` loop to iterate over the range of possible values for `i`, and checks if the condition `i * 8 / 100 == A && i / 10 == B` is true. If it is, it sets `f` to `true` and `ans` to `i`, and breaks out of the loop. Finally, it prints `ans` if `f` is `true`, or `-1` if `f` is `false`.</s>
