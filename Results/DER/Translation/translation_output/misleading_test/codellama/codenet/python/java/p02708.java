<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
43

```
n, k = map(int, input().split())
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print(ans%(10**9+7))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for (int i = k; i <= n + 2; i++) {
            ans += (((2 * n - i + 1) * i) / 2) - (i * (i - 1) / 2) + 1;
        }
        System.out.println(ans % (10 ** 9 + 7));
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first prompts the user to enter two integers `n` and `k`, and then it calculates the sum of the series using a for loop. The `ans` variable is initialized to 0, and then it is updated in each iteration of the loop using the formula provided in the problem statement. Finally, the result is printed modulo 10^9 + 7.</s>
