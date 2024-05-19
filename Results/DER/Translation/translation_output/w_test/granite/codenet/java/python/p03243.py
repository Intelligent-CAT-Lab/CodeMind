System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
111

Expected output:
111


```
import java.util.*;
public class p03243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i < 1000; i++) {
            if (i % 111 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
```


Answer:
```python
def main():
    n = int(input())
    for i in range(n, 1000):
        if i % 111 == 0:
            print(i)
            return

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from contextlib import redirect_stdout

def test_p03243():
    test_inputs = [
        "111",
    ]
    test_outputs = [
        "111",
    ]
    for test_input, test_output in zip(test_inputs, test_outputs):
        sys.stdin = io.StringIO(test_input)
        with redirect_stdout(io.StringIO()) as stdout:
            main()
            assert stdout.getvalue() == test_output + "\n"

test_p03243()
```<|endoftext|>
