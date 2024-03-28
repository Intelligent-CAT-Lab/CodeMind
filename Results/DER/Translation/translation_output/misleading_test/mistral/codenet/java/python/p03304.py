<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
-41.43905052660632

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0 ? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```
[/INST]
```python
n, m, d = map(int, input().split())
s = d == 0 and n or (n - d) * 2
print((s/n/n)*(m-1))
```</s>
