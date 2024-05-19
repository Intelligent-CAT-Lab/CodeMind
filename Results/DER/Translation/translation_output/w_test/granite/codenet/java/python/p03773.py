System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 12

Expected output:
21


```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```


Answer:
```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    ans = A + B
    if ans > 23:
        ans -= 24
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("9 12", "21"),
    ("19 0", "19"),
    ("23 2", "1"),
]
for test_input, expected_output in test_inputs:
    sys.stdin = io.StringIO(test_input)
    main()
    assert sys.stdout.getvalue() == expected_output + "\n"
```<|endoftext|>
