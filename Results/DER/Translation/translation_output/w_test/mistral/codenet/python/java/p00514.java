<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 0 3

Expected output:
4


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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, r = sc.nextInt(), a, b;
        a = n - 1;
        b = r - m * n;
        int d = 1;
        for (int i = 0; i <= a; i++) {
            d *= i + 1;
        }
        int u = 1;
        for (int i = b; i <= a + b; i++) {
            u *= i + 1;
        }
        System.out.println(a < 1 ? u / d : 0);
    }
}
```</s>
