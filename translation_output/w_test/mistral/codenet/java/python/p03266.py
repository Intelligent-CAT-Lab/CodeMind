<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
9


```
import java.util.*;

public class p03266 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    sc.close();

    if (K % 2 == 0) {
      long c1 = N / K;
      long c2 = N / (K / 2) - c1;
      System.out.println(c1 * c1 * c1 + c2 * c2 * c2);
    } else {
      long c = N / K;
      System.out.println(c * c * c);
    }

  }

}
```
[/INST]
```python
N, K = map(int, input().split())

if K % 2 == 0:
    c1 = N // K
    c2 = N // (K // 2) - c1
    print(c1**3 + c2**3)
else:
    c = N // K
    print(c**3)
```</s>
