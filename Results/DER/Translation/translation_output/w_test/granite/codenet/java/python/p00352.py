System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
2000


```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print((a + b) // 2)

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
        input_string = "1000 3000"
        expected_output = "2000"
        with io.StringIO(input_string) as input_file, io.StringIO() as output_file:
            with redirect_stdout(output_file):
                main()
            actual_output = output_file.getvalue().strip()
        self.assertEqual(actual_output, expected_output)

if __name__ == "__main__":
    unittest.main()
```<|endoftext|>
