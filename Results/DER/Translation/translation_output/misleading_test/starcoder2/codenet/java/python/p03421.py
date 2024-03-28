

```python
import sys

def calc(n, a, b):
    for i in range(n - a + 1, n + 1):
        print(i, end=' ')
    rest = n - a - b + 1
    if rest < 0:
        print(-1)
        return
    elif rest >= 1:
        if not calcInner(rest, a - 1, b - 1):
            print(-1)
            return
    for i in range(n - a, rest, -1):
        print(i, end=' ')
    print()

def calcInner(n, a, b):
    first = []
    second = []
    while True:
        if a <= 0 or b <= 0:
            return False
        firstI = n - a + 1 if n - a + 1 >= 1 else 1
        for i in range(firstI, n + 1):
            first.append(i)
        rest = n - a - b + 1
        endI = rest + 1 if rest + 1 >= 1 else 1
        subSecond = []
        for i in range(firstI - 1, endI - 1, -1):
            subSecond.append(i)
        second = subSecond + second
        if rest <= 0:
            print(*first, *second, sep=' ')
            return True
        else:
            n = rest
            a -= 1
            b -= 1

n, a, b = map(int, sys.stdin.readline().split())
calc(n, a, b)
```

## 3422. 最长公共子序列

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5
1 2 3 4 5
1 2 3 4 5

Expected output:
5

```
import java.io.*;
import java.util.*;
 
 
public class p03422 implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    for (int i = 0 ; i < n ; i ++) {
      a[i] = scanner.nextInt();
    }
    for (int i = 0 ; i < m ; i ++) {
      b[i] = scanner.nextInt();
    }

    System.out.println(calc(a, b));
  }

  public int calc(int[] a, int[] b) {
    int[][] dp = new int[a.length + 1][b.length + 1];
    for (int i = 1 ; i <= a.length ; i ++) {
      for (int j = 1 ; j <= b.length ; j ++) {
        if (a[i - 1] == b[j - 1]) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    return dp[a.length][b.length];
  }
 
  public static void main(String[] args) {
    p03422 main = new p03422();
    main.run();
  }
 
  // scanner slightly faster than usual ones
  public static class BetterScanner {
 
    private InputStream stream;
    private byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufferLength = 0;
 
    public Better
