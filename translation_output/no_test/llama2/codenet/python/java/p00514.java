<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,m,r=map(int,input().split())
a,b=sorted([n-1,r-m*n])
d=1
for i in range(a):d*=i+1
u=1
for i in range(b,a+b):u*=i+1
print(0 if a<1 else u//d)

```

### Input

```
4 3 2
```

### Output

```
1
```

### Explanation

```
n=4, m=3, r=2

a=2, b=1

d=1
for i in range(a):d*=i+1
u=1
for i in range(b,a+b):u*=i+1
print(0 if a<1 else u//d)

```

### Code

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,r;
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        int a = 0, b = 0;
        int d = 1;
        int u = 1;
        for (int i = 0; i < n; i++) {
            d *= i + 1;
        }
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }
        System.out.println(0 if (a < 1) else u / d);
    }
}
```
</s>
