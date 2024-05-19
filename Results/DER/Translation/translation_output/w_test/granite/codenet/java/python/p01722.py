System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
1


```
import java.util.Scanner;

public class p01722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 0:
			System.out.println(1);
			break;
		case 1:
			System.out.println(2);
			break;
		case 2:
			System.out.println(1);
			break;
		default:
			System.out.println(0);
			break;
		}
		sc.close();
	}

}
```


Answer:
```python
n = int(input())
if n == 0:
    print(1)
elif n == 1:
    print(2)
elif n == 2:
    print(1)
else:
    print(0)
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [0, 1, 2, 3]
expected_outputs = [1, 2, 1, 0]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    actual_output = p01722(test_input)
    assert actual_output == expected_output, f"Expected {expected_output} for input {test_input}, but got {actual_output}"
```<|endoftext|>
