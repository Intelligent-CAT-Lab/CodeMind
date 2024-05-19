System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 10 2

Expected output:
68

```
import java.util.Scanner;

public class p02606 {

    public p02606() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();

        int Ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0)
                Ans++;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args) {
        new p02606();
    }
}

```


Answer:
```python
import sys

def main():
    L, R, d = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(L, R + 1):
        if i % d == 0:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("5 10 2", "68"),
    ("1 100 1", "100"),
    ("1 100 3", "33"),
]
for test_input, expected_output in test_inputs:
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(test_input + "\n")
    main()
    sys.stdin.close()
    sys.stdout.close()
    with open("output.txt", "r") as f:
        actual_output = f.read().strip()
    assert actual_output == expected_output, f"Expected {expected_output}, got {actual_output}"
```<|endoftext|>
