Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_622_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Long.parseLong(br.readLine());
        long n = (long) ((Math.sqrt(1 + (8 * n1)) - 1) / 2);
        long ans = n1 - (((n + 1) * n) / 2);
        System.out.print((ans!= 0)? ans : n);
    }
}
```

### Response:
```python
import math

def main():
    n1 = int(input())
    n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
    ans = n1 - (((n + 1) * n) // 2)
    print(ans if ans!= 0 else n)

if __name__ == '__main__':
    main()
```

Explanation:

- We import the `math` module to use the `sqrt()` function.
- We define a `main()` function that reads the input from the user and computes the required values.
- We use the `input()` function to read the input from the user and convert it to an integer.
- We use the `sqrt()` function from the `math` module to compute the square root of `1 + (8 * n1)`.
- We subtract `1` from the square root to get the value of `n`.
- We compute the value of `ans` as `n1 - (((n + 1) * n) // 2)`.
- We use the ternary operator to check if `ans` is not equal to `0` and print it, otherwise we print `n`.<|endoftext|>
