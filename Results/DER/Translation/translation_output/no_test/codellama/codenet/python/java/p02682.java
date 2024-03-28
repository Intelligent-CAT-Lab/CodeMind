<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b, c, k = map(int, input().split())
ans = 0
ans += 1*( min(a, k) )
k -= min(a, k)
ans += 0*( min(b, k) )
k -= min(b, k)
ans += (-1)*( min(c, k) )
k -= min(c, k)
print(ans)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
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
        ans += Math.min(a, k);
        k -= Math.min(a, k);
        ans += Math.min(b, k);
        k -= Math.min(b, k);
        ans += Math.min(c, k);
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```
Note that the `Math.min()` method is used to find the minimum of two numbers, and the `Scanner` class is used to read input from the user.</s>
