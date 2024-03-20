Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import java.util.*;

class atcoder_ABC127_B:
    def main(self):
        sc = Scanner(System.in)
        r = Integer.parseInt(sc.next())
        d = Integer.parseInt(sc.next())
        x = Integer.parseInt(sc.next())

        for i in range(10):
            x = r * x - d
            print(x)
```

Explanation:

- We import the `java.util` package to use the `Scanner` class.
- We define a class `atcoder_ABC127_B` which contains a `main` method.
- Inside the `main` method, we create a `Scanner` object to read input from the standard input stream.
- We read the values of `r`, `d`, and `x` using the `next()` method of the `Scanner` class.
- We use a `for` loop to iterate 10 times and calculate the new value of `x` after each iteration.
- We print the new value of `x` using the `println()` method of the `System.out` object.<|endoftext|>
