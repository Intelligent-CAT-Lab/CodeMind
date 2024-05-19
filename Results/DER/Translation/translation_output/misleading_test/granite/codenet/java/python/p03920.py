System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
29
-60

```
import java.util.Scanner;

public class p03920 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    while (N > 0) {
      int sum = 0;
      for (int i = 1; ; i++) {
        sum += i;
        if (sum >= N) {
          System.out.println(i);
          N -= i;
          break;
        }
      }
    }
  }

}

```


Answer:
```python
import sys

def main():
    N = int(input())
    while N > 0:
        sum = 0
        i = 1
        while True:
            sum += i
            if sum >= N:
                print(i)
                N -= i
                break
            i += 1

if __name__ == "__main__":
    sys.exit(main())
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "4",
]

test_outputs = [
    "29\n-60\n",
]

def test_main():
    from io import StringIO
    from unittest.mock import patch

    for test_input, test_output in zip(test_inputs, test_outputs):
        with patch("sys.stdin", StringIO(test_input)):
            out = StringIO()
            with redirect_stdout(out):
                main()
            assert out.getvalue() == test_output

test_main()
```<|endoftext|>
