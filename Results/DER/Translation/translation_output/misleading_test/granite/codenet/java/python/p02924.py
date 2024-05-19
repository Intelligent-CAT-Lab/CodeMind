System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-40

```
import java.util.Scanner;

public class p02924 {

    public static void main(String args[]) {

        // å¥å
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // ä¸»å¦ç
        long result = 0;
        for (int i = n - 1; 0 < i; i--) {
            result += i;
        }

        // åºå
        System.out.println(result);
        sc.close();
    }

}
```


Answer:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    result = 0
    for i in range(n - 1, 0, -1):
        result += i
    print(result)

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
        "2\n",
        "10\n",
    ]
    expected_outputs = [
        "-40\n",
        "-45\n",
    ]
    for test_input, expected_output in zip(test_inputs, expected_outputs):
        with patch("sys.stdin", io.StringIO(test_input)):
            with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
                main()
                assert fake_out.getvalue() == expected_output
```<|endoftext|>
