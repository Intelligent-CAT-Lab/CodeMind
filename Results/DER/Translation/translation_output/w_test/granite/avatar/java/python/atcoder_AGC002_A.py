System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
-1000000000 -1

Expected output:
Positive


```
import java.util.*;

class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a <= 0 && b >= 0 || a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if (a < 0 && b < 0) {
            System.out.println(((b - a + 1) % 2 == 0)? "Positive" : "Negative");
        } else if (a > 0 && b > 0) {
            System.out.println("Positive");
        }
    }
}
```


Answer:
```python
import sys

a, b = map(int, sys.stdin.readline().split())

if a <= 0 and b >= 0 or a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
elif a > 0 and b > 0:
    print("Positive")
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("-1000000000 -1", "Positive"),
    ("1 1", "Zero"),
    ("-1 -1", "Zero"),
    ("1 -1", "Negative"),
    ("-1 1", "Positive"),
]
for test_input, expected_output in test_inputs:
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(test_input)
    sys.stdin.seek(0)
    atcoder_AGC002_A.main()
    sys.stdout.seek(0)
    actual_output = sys.stdout.read().strip()
    assert actual_output == expected_output, f"Expected {expected_output}, got {actual_output}"
```<|endoftext|>
