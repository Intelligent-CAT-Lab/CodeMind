System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
32 51

```
import java.util.Scanner;

public class p03139 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.min(A, B) + " " + Math.max(0, A + B - N));
	}
}
```


Answer:
```python
import sys

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    print(min(A, B), max(0, A + B - N))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest.mock import patch

def test_main():
    test_inputs = [
        "10 3 5",
        "100 10 20",
        "1000 100 200",
    ]
    expected_outputs = [
        "3 27",
        "10 180",
        "100 800",
    ]
    for test_input, expected_output in zip(test_inputs, expected_outputs):
        with patch("sys.stdin", io.StringIO(test_input)):
            with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
                main()
                actual_output = fake_out.getvalue().strip()
                assert actual_output == expected_output
```<|endoftext|>
