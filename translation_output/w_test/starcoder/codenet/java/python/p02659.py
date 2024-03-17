<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
198 1.10

Expected output:
217


```
import java.util.*;

public class p02659 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();
    long bb = (long)((double)100 * b + 0.1);
    long ans = (a * bb) / (long)100;
    System.out.println(ans);
  }
}
```

python code:<fim_suffix><fim_middle>

```python
a = int(input())
b = float(input())
bb = int(100 * b + 0.1)
ans = (a * bb) / 100
print(ans)
```

'''
<|endoftext|>
