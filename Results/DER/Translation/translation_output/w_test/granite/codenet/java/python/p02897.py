System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
0.5000000000


```
import java.util.Scanner;

public class p02897 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}

```


Answer:
```python
import sys

def main():
    n = float(sys.stdin.readline())

    odd = 0
    not_odd = 0
    for i in range(1, int(n) + 1):
        if i % 2 == 0:
            not_odd += 1
        else:
            odd += 1
    print(odd / n)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "4"
expected_output = "0.5000000000"

with patch('builtins.input', return_value=test_input):
    out = io.StringIO()
    with redirect_stdout(out):
        main()
    assert out.getvalue().strip() == expected_output
```<|endoftext|>
