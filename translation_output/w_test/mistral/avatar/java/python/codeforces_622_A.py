<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
99992

Expected output:
311

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_622_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Long.parseLong(br.readLine());
        long n = (long) ((Math.sqrt(1 + (8 * n1)) - 1) / 2);
        long ans = n1 - (((n + 1) * n) / 2);
        System.out.print((ans != 0) ? ans : n);
    }
}
```
[/INST]
```python
import sys

n1 = int(input())
n = int((int(1 + 8 * n1) ** 0.5 - 1) / 2)
ans = n1 - (((n + 1) * n) // 2)
print(ans if ans != 0 else n)
```</s>
