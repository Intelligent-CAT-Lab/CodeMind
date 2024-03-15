<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int a = Math.max(n - 1, r - m * n);
        int b = Math.min(n - 1, r - m * n);
        int d = 1;
        for (int i = 1; i <= a; i++) {
            d *= i;
        }
        int u = 1;
        for (int i = 1; i <= b; i++) {
            u *= i;
        }
        System.out.println(0 < a ? u / d : 0);
    }
}
```</s>
