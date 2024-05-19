System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 2 4

Expected output:
97

```
import java.util.Scanner;

/**
 * Design of a Mansion
 */
public class p00388 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H, A, B;
		H = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();

		int ans = 0;

		for (int i = A; i <= B; i++) {
			if (H % i == 0) ans++;
		}

		System.out.println(ans);
	}
}


```


Answer:
```python
import sys

def main():
    H, A, B = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(A, B + 1):
        if H % i == 0:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("100 2 4", "97"),
    ("100 1 100", "100"),
    ("100 1 99", "99"),
]
for test_input, expected_output in test_inputs:
    sys.stdin = io.StringIO(test_input)
    sys.stdout = io.StringIO()
    main()
    assert sys.stdout.getvalue() == expected_output + "\n"
```<|endoftext|>
