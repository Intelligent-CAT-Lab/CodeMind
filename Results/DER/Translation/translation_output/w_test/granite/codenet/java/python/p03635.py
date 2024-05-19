System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
6


```
import java.util.Scanner;

public class p03635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println((n-1)*(m-1));
	}
}
```


Answer:
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    print((n-1)*(m-1))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest.mock import patch

def test_main():
    test_input = "3 4"
    expected_output = "6"

    with patch("sys.stdin", io.StringIO(test_input)):
        with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
            main()
            actual_output = fake_out.getvalue().strip()

    assert actual_output == expected_output
```<|endoftext|>
