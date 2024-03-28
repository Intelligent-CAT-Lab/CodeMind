<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
3


```
import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

N = int(sys.stdin.readline())
print((N + 1) // 2)
```
"""
<|endoftext|>
