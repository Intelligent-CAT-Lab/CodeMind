<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
YesM

```
n,m,k=map(int,input().split())
ans="No"
for i in range(n//2+1):
  for j in range(m):
    o=i*j+(m-j)*(n-i)
    x=n*m-o
    if o==k or x==k:
      ans="Yes"
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        String ans = "No";
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int o = i * j + (m - j) * (n - i);
                int x = n * m - o;
                if (o == k || x == k) {
                    ans = "Yes";
                }
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first prompts the user to enter three integers, and then it initializes a string variable `ans` to "No". It then enters a nested loop that iterates over the possible values of `i` and `j`, and for each combination of `i` and `j`, it calculates the values of `o` and `x` using the formulae given in the Python code. If either `o` or `x` is equal to `k`, the string variable `ans` is set to "Yes". Finally, the code prints the value of `ans` to the console.</s>
