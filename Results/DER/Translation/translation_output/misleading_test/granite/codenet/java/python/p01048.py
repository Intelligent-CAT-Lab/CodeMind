System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
46

```
import java.util.Scanner;

public class p01048 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] ans = {0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60};
		int i = sc.nextInt();

		System.out.println(ans[i]);
	}

}

```


Answer:
```python
ans = [0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]
i = int(input())
print(ans[i])
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
expected_outputs = [1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]

for i, expected_output in zip(test_inputs, expected_outputs):
    assert ans[i] == expected_output
```<|endoftext|>
