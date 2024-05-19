System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 5 1

Expected output:
YE

```
import java.util.Scanner;

public class p03730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 0; i < 5000; i++) {
			if (a * i % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

```


Answer:
```python
import sys

def main():
    a, b, c = map(int, input().split())
    for i in range(5000):
        if a * i % b == c:
            print("YES")
            sys.exit(0)
    print("NO")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "7 5 1",
    "1 1 0",
    "2 2 0",
]

expected_outputs = [
    "YES",
    "YES",
    "NO",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    sys.stdin = io.StringIO(test_input)
    main()
    assert sys.stdout.getvalue().strip() == expected_output
```<|endoftext|>
