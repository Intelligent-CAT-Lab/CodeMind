System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
import java.util.*;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}

```


Answer:
```python
x = int(input())
next = 2
for i in range(x):
    next = (next + 1) * 2
print(next)
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "2",
]

test_outputs = [
    "14",
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    input_value = test_input
    sys.stdin = io.StringIO(input_value)
    captured_output = io.StringIO()
    sys.stdout = captured_output

    solution()

    actual_output = captured_output.getvalue().strip()

    assert actual_output == expected_output
```<|endoftext|>
