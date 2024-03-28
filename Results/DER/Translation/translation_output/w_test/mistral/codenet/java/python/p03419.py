<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
0


```
import java.util.Scanner;

public class p03419 {

    private Scanner in = new Scanner(System.in);

    void solve() {
        long n = in.nextLong(), m = in.nextLong();
        if(n == 2 || m == 2) {
            System.out.println(0);
            return;
        }
        long ans = Math.max(1, n - 2) * Math.max(1, m - 2);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new p03419().solve();
    }
}
```
[/INST]
```python
n, m = map(int, input().split())
if n == 2 or m == 2:
    print(0)
else:
    ans = max(1, n - 2) * max(1, m - 2)
    print(ans)
```</s>
