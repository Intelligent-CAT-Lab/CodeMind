System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 7 1

Expected output:
Left


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
    left = sum(map(int, sys.stdin.readline().split()))
    right = sum(map(int, sys.stdin.readline().split()))
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = """
3 8 7 1
"""

sys.stdin = io.StringIO(test_input)
main()
assert sys.stdout.getvalue() == "Left\n"

test_input = """
1 2 3 4
"""

sys.stdin = io.StringIO(test_input)
main()
assert sys.stdout.getvalue() == "Balanced\n"

test_input = """
1 2 3 5
"""

sys.stdin = io.StringIO(test_input)
main()
assert sys.stdout.getvalue() == "Right\n"
```<|endoftext|>
