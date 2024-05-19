System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 16

Expected output:
9


```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02957 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		long k = a + b;
		if (k % 2 == 0)
			System.out.println(k / 2);
		else
			System.out.println("IMPOSSIBLE");
		in.close();
	}
}

```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    k = a + b
    if k % 2 == 0:
        print(k // 2)
    else:
        print("IMPOSSIBLE")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("2 16", "9"),
    ("1 2", "IMPOSSIBLE"),
    ("10 10", "10"),
]

def test_main():
    from io import StringIO
    for test_input, expected_output in test_inputs:
        sys.stdin = StringIO(test_input)
        main()
        assert sys.stdout.getvalue() == expected_output + "\n"

test_main()
```<|endoftext|>
