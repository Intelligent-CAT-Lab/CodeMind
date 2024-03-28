<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9995083

Expected output:
837779626111757


```
import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n + 1; i++) {
            ans += (long) i * ((long) n / (long) i) * (((long) n / (long) i) + 1) / 2;
        }
        System.out.println(ans);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

n = int(sys.stdin.readline())
ans = 0
for i in range(1, n + 1):
    ans += i * (n // i) * ((n // i) + 1) // 2
print(ans)
```
"""
<|endoftext|>
