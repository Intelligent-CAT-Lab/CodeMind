<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 0");
        } else if (n < 0) {
            System.out.println("0 " + (A + B - K));
        } else {
            System.out.println(n + " " + B);
        }
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import sys

A, B, K = map(int, sys.stdin.readline().split())

if A + B <= K:
    print(0, 0)
elif A - K < 0:
    print(0, A + B - K)
else:
    print(A - K, B)
```
"""

import sys

A, B, K = map(int, sys.stdin.readline().split())

if A + B <= K:
    print(0, 0)
elif A - K < 0:
    print(0, A + B - K)
else:
    print(A - K, B)
<|endoftext|>
