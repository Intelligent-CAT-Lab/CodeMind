<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
17
0
11
28
59
51
132
258
526
929

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

python code:<fim_suffix><fim_middle>

```python
import sys

r, d, x = map(int, sys.stdin.readline().split())

for i in range(10):
    x = r * x - d
    print(x)
```

'''
<|endoftext|>
