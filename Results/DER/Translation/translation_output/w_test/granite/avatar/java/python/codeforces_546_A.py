System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 1000000000 1000

Expected output:
0


```
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o, g, x = 0;
        long n, borrow = 0;

        o = sc.nextInt();
        n = sc.nextLong();
        g = sc.nextInt();

        for (int i = 1; i <= g; i++) {
            x = x + i * o;
        }

        borrow = x - n;

        if (borrow <= 0)
            System.out.println(0);
        else
            System.out.println(borrow);
    }
}
```


Answer:
```python
import sys

o, n, g = map(int, sys.stdin.readline().split())
borrow = sum(i * o for i in range(1, g + 1)) - n
print(max(borrow, 0))
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "1000 1000000000 1000",
    "100 1000000000 1000",
    "1000 1000000000 1000000000",
]

expected_outputs = [
    "0",
    "0",
    "10000000000",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    with open('input.txt', 'w') as f:
        f.write(test_input)

    actual_output = subprocess.check_output(['python', 'codeforces_546_A.py']).decode('utf-8').strip()
    assert actual_output == expected_output, f"Expected output: {expected_output}, Actual output: {actual_output}"
```<|endoftext|>
