<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
501719768609305159 370614275896614890 131105492712690269

Expected output:
370614275896614948

```
import java.util.*;

class atcoder_ABC158_B {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {
    public void run() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long base = N / (A + B);
        long mod = N % (A + B);
        if (mod >= A)
            mod = A;
        System.out.println(base * A + mod);
        return;
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    input = sys.stdin.readline
    N, A, B = map(int, input().split())
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    print(base * A + mod)

if __name__ == '__main__':
    main()
```
"""

import sys

def main():
    input = sys.stdin.readline
    N, A, B = map(int, input().split())
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    print(base * A + mod)

if __name__ == '__main__':
    main()
<|endoftext|>
