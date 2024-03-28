<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
 4
1 2 0
12 1
2 3 (0
q2 3 2

```
l = int(input())

d = max([d for d in range(30) if 2**d <= l])
n = d+1
m = 2*d
ans = []
for i in range(1, n):
    ans.append((i, i+1, 0))
    ans.append((i, i+1, 2**(i-1)))

while l > 2**d:
    for i in range(n-1, 0, -1):
        if l-2**(i-1) > 2**d-1:
            ans.append((i, n, l-2**(i-1)))
            m += 1
            l -= 2**(i-1)
            break

print(n, m)
for a in ans:
    print(*a)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int d = (int) Math.log(l) / Math.log(2);
        int n = d + 1;
        int m = 2 * d;
        List<int[]> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, (int) Math.pow(2, i - 1)});
        }

        while (l > (int) Math.pow(2, d)) {
            for (int i = n - 1; i >= 0; i--) {
                if (l - (int) Math.pow(2, i - 1) > (int) Math.pow(2, d) - 1) {
                    ans.add(new int[]{i, n, l - (int) Math.pow(2, i - 1)});
                    m++;
                    l -= (int) Math.pow(2, i - 1);
                    break;
                }
            }
        }

        System.out.println(n, m);
        for (int[] a : ans) {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
    }
}
```</s>
