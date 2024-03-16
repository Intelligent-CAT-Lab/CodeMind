<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.*;

class atcoder_ABC158_B:
    def main(self):
        sc = Scanner(System.in)
        N = sc.nextLong()
        A = sc.nextLong()
        B = sc.nextLong()
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        print(base * A + mod)
        return

if __name__ == "__main__":
    atcoder_ABC158_B().main()
```
"""

import java.util.*;

class atcoder_ABC158_B:
    def main(self):
        sc = Scanner(System.in)
        N = sc.nextLong()
        A = sc.nextLong()
        B = sc.nextLong()
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        print(base * A + mod)
        return

if __name__ == "__main__":
    atcoder_ABC158_B().main()
<|endoftext|>
