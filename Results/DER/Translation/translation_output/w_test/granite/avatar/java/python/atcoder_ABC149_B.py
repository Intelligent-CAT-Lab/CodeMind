System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
0 1000000000000

```
import java.util.*;

class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 0");
        } else if (n < 0) {
            System.out.println("0 " + (A + B - K));
        } else {
            System.out.println(n + " " + B);
        }
    }
}
```


Answer:
```python
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    n = A - K
    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0", A + B - K)
    else:
        print(n, B)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "10000000000000 10000000000000 10000000000000",
    "10000000000000 10000000000000 10000000000001",
    "10000000000000 10000000000000 20000000000000",
]

expected_outputs = [
    "0 10000000000000",
    "0 10000000000000",
    "0 0",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(test_input + "\n")
    main()
    sys.stdin.close()
    sys.stdout.close()
    with open("output.txt", "r") as output_file:
        actual_output = output_file.read().strip()
    assert actual_output == expected_output, f"Expected output: {expected_output}, Actual output: {actual_output}"
```<|endoftext|>
