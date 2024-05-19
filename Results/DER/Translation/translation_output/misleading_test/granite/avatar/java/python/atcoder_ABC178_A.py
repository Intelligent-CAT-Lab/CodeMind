System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
25

```
public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```


Answer:
```python
import sys

x = int(sys.stdin.read())
if x == 0:
    print("1")
else:
    print("0")
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "0",
    "1",
    "-1",
    "100",
    "-100",
]

test_outputs = [
    "1",
    "0",
    "0",
    "1",
    "0",
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    with open('input.txt', 'w') as f:
        f.write(test_input)

    actual_output = subprocess.check_output(['python','solution.py']).decode().strip()
    assert actual_output == expected_output, f"Expected output {expected_output}, but got {actual_output} for input {test_input}"
```<|endoftext|>
