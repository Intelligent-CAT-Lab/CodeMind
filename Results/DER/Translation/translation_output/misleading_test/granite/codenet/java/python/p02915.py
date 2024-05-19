System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-46

```

import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        new p02915().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int ans = S * S* S;


        System.out.println(ans);
    }
}

```


Answer:
```python
import sys

def main():
    S = int(sys.stdin.read())
    ans = S * S * S
    print(ans)

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
        input_str = "2"
        expected_output = "-46"
        with io.StringIO(input_str) as input_file, io.StringIO() as output_file:
            with redirect_stdout(output_file):
                main()
            actual_output = output_file.getvalue().strip()
        self.assertEqual(actual_output, expected_output)

    def test_case_2(self):
        input_str = "3"
        expected_output = "-27"
        with io.StringIO(input_str) as input_file, io.StringIO() as output_file:
            with redirect_stdout(output_file):
                main()
            actual_output = output_file.getvalue().strip()
        self.assertEqual(actual_output, expected_output)

if __name__ == "__main__":
    unittest.main()
```<|endoftext|>
