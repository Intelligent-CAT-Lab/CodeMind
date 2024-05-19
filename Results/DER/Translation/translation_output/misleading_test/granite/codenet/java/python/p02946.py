System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 7

Expected output:
5 6 7 8

```
import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i!= X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}

```


Answer:
```python
import sys

def main():
    K, X = map(int, sys.stdin.readline().split())
    for i in range(X - K + 1, X + K):
        if i == X + K - 1:
            print(i)
        else:
            print(i, end=" ")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "3 7"
expected_output = "5 6 7 8"
output = io.StringIO()
with redirect_stdout(output):
    main()
assert output.getvalue().strip() == expected_output
```<|endoftext|>
