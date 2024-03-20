Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import java.util.*;

class atcoder_ABC158_B:
    def main(self):
        new Solver().run()

class Solver:
    def run(self):
        sc = Scanner(System.in)
        N = sc.nextLong()
        A = sc.nextLong()
        B = sc.nextLong()
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        System.out.println(base * A + mod)
        return
```<|endoftext|>
