System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
c

Expected output:
O

```
import java.util.*;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println(++c);
    }
}
```


Answer:
```python
import sys

def main():
    c = sys.stdin.read(1)
    print(chr(ord(c) + 1))

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
        input_str = "c"
        expected_output = "O"
        with io.StringIO() as fake_out:
            with redirect_stdout(fake_out):
                main()
            actual_output = fake_out.getvalue().strip()
        self.assertEqual(actual_output, expected_output)

if __name__ == "__main__":
    unittest.main()
```<|endoftext|>
