<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 6

Expected output:
61

```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class atcoder_ABC124_A {
    public static void main(String[] args) throws Exception {
        System.out.println(solve());
    }

    private static int solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            return a * 2;
        } else if (a > b) {
            return a * 2 - 1;
        } else {
            return b * 2 - 1;
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def solve():
    a, b = map(int, sys.stdin.readline().split())
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

print(solve())
```

"""

import sys

def solve():
    a, b = map(int, sys.stdin.readline().split())
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

print(solve())
<|endoftext|>
