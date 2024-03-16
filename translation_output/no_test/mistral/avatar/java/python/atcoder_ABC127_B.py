<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```
[/INST]
```python
import sys

r = int(input())
d = int(input())
x = int(input())

for i in range(10):
    x = r * x - d
    print(x)
```</s>
