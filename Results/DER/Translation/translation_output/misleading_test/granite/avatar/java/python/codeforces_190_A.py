System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
59 96

Expected output:
96 154 -55

```
import java.io.*;
import java.util.*;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 0) {
            if (m!= 0)
                System.out.println("Impossible");
            else
                System.out.println(0 + " " + 0);
            return;
        }

        if (m <= n) {
            if (m == 0) {
                m = 1;
            }
            System.out.print(n + " " + (m + n - 1));
            return;
        }

        System.out.print(m + " " + (m + n - 1));
    }
}
```


Answer:
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())

    if n == 0:
        if m!= 0:
            print("Impossible")
        else:
            print("0 0")
        return

    if m <= n:
        if m == 0:
            m = 1
        print(n, m + n - 1)
        return

    print(m, m + n - 1)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("59 96", "96 154 -55"),
    ("0 0", "0 0"),
    ("0 1", "0 1"),
    ("1 0", "1 1"),
    ("1 1", "1 2"),
]

for test_input, expected_output in test_inputs:
    sys.stdin = io.StringIO(test_input)
    main()
    assert sys.stdout.getvalue().strip() == expected_output
```<|endoftext|>
