System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
0


```
import java.util.Scanner;

public class p03417 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}

```


Answer:
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    print(abs((N-2) * (M-2)))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_data = [
    ("2 2", "0"),
]
for input_data, expected_output in test_data:
    sys.stdin = io.StringIO(input_data)
    sys.stdout = io.StringIO()
    main()
    assert sys.stdout.getvalue() == expected_output + "\n"
```<|endoftext|>
