<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 1 3

Expected output:
2


```
a, b, c, k = map(int, input().split())
ans = 0
ans += 1*( min(a, k) )
k -= min(a, k)
ans += 0*( min(b, k) )
k -= min(b, k)
ans += (-1)*( min(c, k) )
k -= min(c, k)
print(ans)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        ans += 1 * (Math.min(a, k));
        k -= Math.min(a, k);
        ans += 0 * (Math.min(b, k));
        k -= Math.min(b, k);
        ans += (-1) * (Math.min(c, k));
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.min()` method to find the minimum of two numbers. The `ans` variable is used to store the final result, and the `k` variable is used to keep track of the remaining amount of money. The code then prints the final result to the console.</s>
