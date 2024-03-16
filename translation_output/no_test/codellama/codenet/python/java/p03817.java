<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x=int(input())

ans=0
q,r=divmod(x,11)
ans+=2*q
q,r=divmod(r,6)
ans+=q
if r>0:
  ans+=1
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
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
Note that the `divmod` function in Python is not directly equivalent to the `%` operator in Java, but it can be used to achieve the same result. The `divmod` function returns a tuple containing the quotient and remainder of the division, which can be used to calculate the number of 11s and 6s that divide the input number.</s>
