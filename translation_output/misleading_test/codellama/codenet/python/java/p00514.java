<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 0 3

Expected output:
94

```
n,m,r=map(int,input().split())
a,b=sorted([n-1,r-m*n])
d=1
for i in range(a):d*=i+1
u=1
for i in range(b,a+b):u*=i+1
print(0 if a<1 else u//d)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int a = n - 1;
        int b = r - m * n;
        int d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }
        int u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }
        System.out.println(0 < a ? u / d : 0);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it calculates the values of `a`, `b`, `d`, and `u` using the given formula. Finally, it prints the result.

Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print the result.

Also, note that the `//` operator is used to perform integer division, which is different from the `/` operator, which performs floating-point division.</s>
