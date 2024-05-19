System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
-48

```
import java.util.*;
import java.lang.*;


public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
            power = (power*i)%(Math.pow(10, 9) + 7);
        }
        System.out.println((int)power);
    }
}
```


Answer:
```python
def main():
    cnt = int(input())
    power = 1
    for i in range(1, cnt + 1):
        power = (power * i) % (10 ** 9 + 7)
    print(int(power))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import unittest

class TestP03796(unittest.TestCase):
    def test_case_1(self):
        input_str = "3"
        expected_output = "-48"
        with self.assertRaises(SystemExit) as cm:
            with open(os.devnull, "w") as devnull:
                old_stdout = sys.stdout
                sys.stdout = devnull
                try:
                    main()
                except SystemExit as e:
                    self.assertEqual(e.code, 0)
                finally:
                    sys.stdout = old_stdout
        self.assertEqual(self._get_output(), expected_output)

    def _get_output(self):
        with open(os.devnull, "w") as devnull:
            old_stdout = sys.stdout
            sys.stdout = devnull
            try:
                main()
            except SystemExit as e:
                return e.code
            finally:
                sys.stdout = old_stdout

if __name__ == "__main__":
    unittest.main()
```<|endoftext|>
