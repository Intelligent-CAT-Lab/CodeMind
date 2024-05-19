System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 7 1

Expected output:
eft

```
import java.util.*;

public class p03477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt() + sc.nextInt();
        int right = sc.nextInt() + sc.nextInt();
        if(left > right) {
            System.out.print("Left");
        } else if (left == right) {
            System.out.print("Balanced");
        } else {
            System.out.print("Right");
        }
    }
}

```


Answer:
```python
import sys

def main():
    left, right = map(int, sys.stdin.read().split())
    if left + right > 0:
        print("Left")
    elif left + right == 0:
        print("Balanced")
    else:
        print("Right")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("3 8 7 1", "eft"),
    ("1 2 3 4", "Balanced"),
    ("-1 -2 -3 -4", "Right"),
]
for test_input, expected_output in test_inputs:
    sys.stdin = io.StringIO(test_input)
    main()
    assert sys.stdout.getvalue().strip() == expected_output
```<|endoftext|>
