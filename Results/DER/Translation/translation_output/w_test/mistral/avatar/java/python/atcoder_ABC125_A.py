<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 20 19

Expected output:
0


```
import java.util.Scanner;

public class atcoder_ABC125_A {
    static long n, k, m, l, a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        k = 0;
        for (int i = 1; i * a <= n; i++) {
            k += b;
        }
        System.out.println(k);
    }
}
```
[/INST]
```python
a, b, n = map(int, input().split())
k = 0
for i in range(1, int(n//a)+1):
    k += b
print(k)
```</s>
