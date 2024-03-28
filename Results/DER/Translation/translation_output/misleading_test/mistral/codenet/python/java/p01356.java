<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 200 2 3 4 5

Expected output:
28

```
def solve():
    n,m,a,b,p,q = map(int,input().split())
    if a==1 and b==1:
        if (p+q)*n <= m:
            return m - (p+q)*n
        else:
            k = m//(p+q)
            return min(m-k*(p+q),(k+1)*(p+q)-m)
    else:
        ans = m
        for i in range(min(n-1,40),-1,-1):
            f = p*(a**i) + q*(b**i)
            if m < f:
                ans = min(ans, f-m)
            else:
                m -= f
            ans = min(ans,m)
        return ans

def main():
    print(solve())

if __name__ == '__main__':
    main()
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, a, b, p, q;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        p = sc.nextInt();
        q = sc.nextInt();
        int ans = solve(n, m, a, b, p, q);
        System.out.println(ans);
    }

    public static int solve(int n, int m, int a, int b, int p, int q) {
        if (a == 1 && b == 1) {
            if ((p + q) * n <= m) {
                return m - (p + q) * n;
            } else {
                int k = m / (p + q);
                return Math.min(m - k * (p + q), (k + 1) * (p + q) - m);
            }
        } else {
            int ans = m;
            for (int i = Math.max(0, n - 40); i >= 0; i--) {
                int f = p * Math.pow(a, i) + q * Math.pow(b, i);
                if (m < f) {
                    ans = Math.min(ans, f - m);
                } else {
                    m -= f;
                    ans = Math.min(ans, m);
                }
            }
            return ans;
        }
    }
}
```</s>
