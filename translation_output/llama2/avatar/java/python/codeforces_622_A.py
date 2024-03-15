<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解题思路

```python
import sys

n1 = int(sys.stdin.readline())
n = (int)((math.sqrt(1 + (8 * n1)) - 1) / 2)
ans = n1 - ((n + 1) * n) / 2
print(ans)
```

### 复杂度分析

- 时间复杂度：O(1)
- 空间复杂度：O(1)
</s>
