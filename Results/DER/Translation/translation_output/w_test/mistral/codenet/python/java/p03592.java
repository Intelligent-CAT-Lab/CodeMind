<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
Yes


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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        String ans = "No";
        for (int i = 1; i <= n / 2; i++) {
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
```</s>
