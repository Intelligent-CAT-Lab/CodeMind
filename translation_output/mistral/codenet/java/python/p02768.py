<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p02768 {
  public static int m = 1000000007;

  public static int pow(int a, int b) {
    long s = 1;
    long a2 = a;
    while (b > 0) {
      if ((b & 1) != 0) {
        s = s * a2 % m;
      }
      a2 = a2 * a2 % m;
      b >>= 1;
    }
    return (int)s;
  }
  public static int reverse(int a) {
    return pow(a, m - 2);
  }

  public static int sub(int n, int a) {
    if (a > n / 2) {
      a = n - a;
    }
    long s1 = 1;
    int n2 = n - a;
    for (int i = n; i > n2; i--) {
      s1 = s1 * i % m;
    }
    long s2 = 1;
    for (int i = 1; i <= a; i++) {
      s2 = s2 * i % m;
    }
    int s3 = reverse((int)s2);
    return (int)(s1 * s3 % m);
  }

  public static void main(String[] args) {
    var sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    long all = pow(2, n);

    long answer = (all + 2 * m - sub(n, a) - sub(n, b) - 1) % m;
    System.out.println(answer);
  }
}
```
[/INST]
```python
import math

def pow(a, b):
    s = 1
    a2 = a
    while b > 0:
        if (b & 1) != 0:
            s = s * a2 % 1000000007
        a2 = a2 * a2 % 1000000007
        b >>= 1
    return int(s)

def reverse(a):
    return pow(a, 1000000007 - 2)

def sub(n, a):
    if a > n // 2:
        a = n - a
    s1 = 1
    n2 = n - a
    for i in range(n, n2 - 1, -1):
        s1 = s1 * i % 1000000007
    s2 = 1
    for i in range(1, a + 1):
        s2 = s2 * i % 1000000007
    s3 = reverse(s2)
    return int((s1 * s3) % 1000000007)

n = int(input())
a = int(input())
b = int(input())

all = math.pow(2, n)

answer = (all + 2 * 1000000007 - sub(n, a) - sub(n, b) - 1) % 1000000007
print(answer)
```</s>
