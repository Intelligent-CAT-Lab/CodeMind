System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
2

```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```


Answer:
```python
x = int(input())
i = 1
while i * (i + 1) // 2 < x:
    i += 1
print(i)
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "6",
]

test_outputs = [
    "2",
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    input_value = test_input
    expected_value = expected_output
    actual_value = str(p03781(input_value))
    assert actual_value == expected_value, f"Expected {expected_value}, got {actual_value} for input {input_value}"
```<|endoftext|>
