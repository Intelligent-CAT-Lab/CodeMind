System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2


```
import java.util.Scanner;

class p03583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        // a
        for (int i = 1; i < 3510; i++) {
            // b
            for (int j = 1; j < 3510; j++) {
                long si = n * i * j;
                long bo = 4 * i * j - n * j - n * i;
                if (bo <= 0) {
                    continue;
                }
                if (si % bo == 0) {
                    System.out.println(i + " " + j + " " + (si / bo));
                    return;
                }
            }
        }
    }
}

```


Answer:
```python
import math

def main():
    n = int(input())
    for i in range(1, 3510):
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                print(i, j, si // bo)
                return

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest import mock

def test_main():
    test_inputs = [
        "2\n",
    ]
    expected_outputs = [
        "1 2 2\n",
    ]
    for test_input, expected_output in zip(test_inputs, expected_outputs):
        with mock.patch("sys.stdin", io.StringIO(test_input)):
            with mock.patch("sys.stdout", new_callable=io.StringIO) as fake_out:
                main()
                actual_output = fake_out.getvalue()
                assert actual_output == expected_output

test_main()
```<|endoftext|>
