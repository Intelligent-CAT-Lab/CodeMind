<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 14 80

Expected output:
3


```
a,b,c=map(int,input().split())
ans=0
for i in range(a,b+1):
    if c%i==0:
        ans+=1
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `map` function to convert the input string to an integer. The `range` function is used to iterate over the range of numbers from `a` to `b`, and the `if` statement is used to check if `c` is divisible by `i`. If it is, the `ans` variable is incremented. Finally, the `println` method is used to print the value of `ans`.</s>
