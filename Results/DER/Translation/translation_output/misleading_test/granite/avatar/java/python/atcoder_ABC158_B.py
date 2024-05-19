System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    print(base * A + mod)

if __name__ == '__main__':
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    (501719768609305159, 370614275896614890, 131105492712690269),
    (100000000000000000, 1, 1),
    (100000000000000000, 100000000000000000, 100000000000000000),
]

expected_outputs = [
    370614275896614948,
    100000000000000000,
    100000000000000000,
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    assert main(*test_input) == expected_output
```<|endoftext|>
