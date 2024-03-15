<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

n, k, m, l, a, b, c = map(int, sys.stdin.readlines())

print(k)
```</s>
