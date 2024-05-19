System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 896 7

Expected output:
2


```
import java.math.BigInteger;
import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();
        BigInteger bigA = BigInteger.valueOf(A);
        BigInteger bigB = BigInteger.valueOf(B);
        
        for (int x = -1000; x <= 1000; x++) {
            if (BigInteger.valueOf(x).pow(N).multiply(bigA).equals(bigB)) {
                System.out.println(x);
                return;
            }
        }
        
        System.out.println("No solution");
    }
}
```


Answer:
```python
import math

def main():
    A, B, N = map(int, input().split())
    for x in range(-1000, 1001):
        if A * x ** N == B:
            print(x)
            return
    print("No solution")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "7 896 7",
    "1 1 1",
    "1 2 1",
    "-1 1 1",
    "0 0 1",
    "1 1 0",
    "1 1 2",
    "1 1 3",
    "1 1 4",
    "1 1 5",
    "1 1 6",
    "1 1 7",
    "1 1 8",
    "1 1 9",
    "1 1 10",
]

expected_outputs = [
    "2",
    "1",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
    "No solution",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    with open("input.txt", "w") as input_file:
        input_file.write(test_input)
    main()
    with open("output.txt", "r") as output_file:
        actual_output = output_file.read().strip()
    assert actual_output == expected_output, f"Expected output: {expected_output}, Actual output: {actual_output}"
```<|endoftext|>
