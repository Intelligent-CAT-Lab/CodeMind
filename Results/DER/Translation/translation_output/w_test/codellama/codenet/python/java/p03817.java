<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
2


```
x=int(input())

ans=0
q,r=divmod(x,11)
ans+=2*q
q,r=divmod(r,6)
ans+=q
if r>0:
  ans+=1
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        int q = x / 11;
        int r = x % 11;
        ans += 2 * q;
        q = r / 6;
        ans += q;
        if (r > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
```
This code first prompts the user to enter an integer `x` using the `Scanner` class. It then calculates the number of times `x` is divisible by 11 and the remainder when `x` is divided by 11 using the `divmod` function. The result is stored in the variables `q` and `r`.

The code then calculates the number of times `r` is divisible by 6 and the remainder when `r` is divided by 6 using the `divmod` function. The result is stored in the variables `q` and `r`.

The code then adds the number of times `q` is divisible by 6 to the number of times `x` is divisible by 11, and adds 1 if `r` is not equal to 0. Finally, the code prints the result.

Note that the `divmod` function is not available in Java, so we have to use the modulo operator (`%`) to calculate the remainder.</s>
