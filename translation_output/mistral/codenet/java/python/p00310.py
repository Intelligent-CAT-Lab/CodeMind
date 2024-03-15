<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        System.out.println(p + m + c);
    }
}


```
[/INST]
```python
import sys

p, m, c = map(int, sys.stdin.readline().split())
print(p + m + c)
```</s>
