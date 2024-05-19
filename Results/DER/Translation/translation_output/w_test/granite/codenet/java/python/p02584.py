System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 2 4

Expected output:
2


```

import java.util.Scanner;

public class p02584 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = Long.parseLong(scan.next());
        long k = Long.parseLong(scan.next());
        long d = Long.parseLong(scan.next());
        scan.close();

        long ans = 0;
        long absX = Math.abs(x);
        if (absX / d >= k) {
            ans = absX - k * d;
        } else {
            long sho = absX / d;
            long amari = absX % d;
            if ((k - sho) % 2 == 0) {
                ans = amari;
            } else {
                ans = d - amari;
            }
        }

        System.out.println(ans);
    }
}

```


Answer:
```python
import sys

def main():
    x, k, d = map(int, sys.stdin.readline().split())
    x = abs(x)
    if x // d >= k:
        ans = x - k * d
    else:
        sho = x // d
        amari = x % d
        if (k - sho) % 2 == 0:
            ans = amari
        else:
            ans = d - amari
    print(ans)

if __name__ == '__main__':
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "6 2 4",
    "1 1 1",
    "-1 1 1",
    "100000000000000000 100000000000000000 100000000000000000",
]

expected_outputs = [
    "2",
    "0",
    "0",
    "0",
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
