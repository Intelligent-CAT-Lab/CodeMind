Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
54 20

Expected output:
2


```
import java.io.*;

class p02256 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(GCD(a, b));
    }

    public static int GCD (int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) return b;
        else return GCD (b, a%b);
    }
}
```

### Response:
```python
import math

def GCD(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return GCD(b, a % b)

a, b = map(int, input().split())
print(GCD(a, b))
```

Explanation:

- We first import the `math` module to use the `gcd()` function.
- We define a function `GCD()` that takes two integers `a` and `b` as input and returns their greatest common divisor using the Euclidean algorithm.
- We read the input integers `a` and `b` from the user using the `input()` function and split them using the `split()` function.
- We call the `GCD()` function with `a` and `b` as arguments and print the result using the `print()` function.<|endoftext|>
