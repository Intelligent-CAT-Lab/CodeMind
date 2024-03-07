<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

a = int(sys.stdin.readline())
b = float(sys.stdin.readline())
bb = int(100 * b + 0.1)
ans = a * bb // 100
print(ans)
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor()` function in Java.</s>
