System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
418379342 802780784 -790013317 -445130206

Expected output:
-186233282690604452


```
import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        System.out.println(Math.max(Math.max(Math.max(a * c, b * d), a * d), b * c));
    }
}
```


Answer:
```python
import sys

a, b, c, d = map(int, sys.stdin.readline().split())

print(max(a * c, b * d, a * d, b * c))
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "418379342 802780784 -790013317 -445130206",
    "100000000 100000000 100000000 100000000",
    "-100000000 -100000000 -100000000 -100000000",
]

expected_outputs = [
    -186233282690604452,
    4000000000,
    -4000000000,
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    output = subprocess.check_output(["python", "atcoder_ABC178_B.py"], input=test_input, text=True)
    assert output.strip() == str(expected_output)
```<|endoftext|>
