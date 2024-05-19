System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-86

```
import java.util.*;

public class p02759 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.printf("%d", (N + 1) / 2);
    sc.close();
    return;
  }
}
```


Answer:
```python
import sys

def main():
    N = int(sys.stdin.read())
    print((N + 1) // 2)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import unittest
from contextlib import redirect_stdout

class TestClass(unittest.TestCase):
    def test_case_1(self):
        input_str = "5"
        expected_output = "-86"
        with io.StringIO(input_str) as input_file, io.StringIO() as output_file:
            with redirect_stdout(output_file):
                main()
            actual_output = output_file.getvalue().strip()
        self.assertEqual(actual_output, expected_output)

    def test_case_2(self):
        input_str = "10"
        expected_output = "5"
        with io.StringIO(input_str) as input_file, io.StringIO() as output_file:
            with redirect_stdout(output_file):
                main()
            actual_output = output_file.getvalue().strip()
        self.assertEqual(actual_output, expected_output)

    def test_case_3(self):
        input_str = "15"
        expected_output = "8"
        with io.StringIO(input_str) as input_file, io.StringIO() as output_file:
            with redirect_stdout(output_file):
                main()
            actual_output = output_file.getvalue().strip()
        self.assertEqual(actual_output, expected_output)

if __name__ == "__main__":
    unittest.main()
```<|endoftext|>
