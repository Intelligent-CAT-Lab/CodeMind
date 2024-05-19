System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000087

```
public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```


Answer:
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    print((n // k + 1) * k)

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
        ("999999999 1\n", "1000000087\n"),
    ]
    for test_input, expected_output in test_inputs:
        with patch("sys.stdin", io.StringIO(test_input)):
            with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
                main()
                actual_output = fake_out.getvalue()
                assert actual_output == expected_output

test_main()
```<|endoftext|>
