System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
Possibli

```
import java.util.Scanner;

public class p03657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) System.out.println("Possible");
        else System.out.println("Impossible");
    }
}
```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
        print("Possible")
    else:
        print("Impossible")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("4 5", "Possible"),
    ("1 2", "Impossible"),
    ("3 6", "Possible"),
]
for test_input, expected_output in test_inputs:
    sys.stdin = io.StringIO(test_input)
    main()
    assert sys.stdout.getvalue().strip() == expected_output
```<|endoftext|>
