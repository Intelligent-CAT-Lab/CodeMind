System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
198 1.10

Expected output:
217


```
import java.util.*;

public class p02659 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();
    long bb = (long)((double)100 * b + 0.1);
    long ans = (a * bb) / (long)100;
    System.out.println(ans);
  }
}
```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    bb = int(b * 100 + 0.1)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from unittest.mock import patch

def test_p02659():
    input_data = "198 1.10"
    expected_output = "217"
    with patch("sys.stdin", io.StringIO(input_data)):
        with patch("sys.stdout", new_callable=io.StringIO) as fake_out:
            main()
            actual_output = fake_out.getvalue().strip()
            assert actual_output == expected_output

test_p02659()
```<|endoftext|>
