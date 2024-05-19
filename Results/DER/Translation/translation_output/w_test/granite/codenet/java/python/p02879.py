System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5

Expected output:
10


```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p02879 {
    public static void main(String[] args) {
        p02879 main = new p02879();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (9 < A || 9 < B) {
            System.out.println(-1);
            return;
        }
        System.out.println(A * B);
    }
}

```


Answer:
```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    if A > 9 or B > 9:
        print(-1)
    else:
        print(A * B)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    ("2 5", "10"),
    ("10 10", "100"),
    ("10 11", "-1"),
]
for input, expected_output in test_cases:
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(input + "\n")
    main()
    sys.stdin.close()
    sys.stdout.close()
    with open("output.txt", "r") as f:
        actual_output = f.read().strip()
    assert actual_output == expected_output, f"Expected {expected_output}, got {actual_output}"
```<|endoftext|>
