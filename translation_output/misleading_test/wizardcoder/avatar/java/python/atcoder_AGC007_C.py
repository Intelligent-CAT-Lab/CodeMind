Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 100 100

Expected output:
649620206.028769

```
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double N = scan.nextDouble();
        double d = scan.nextDouble();
        double x = scan.nextDouble();

        BigDecimal ans = new BigDecimal("0.0");

        while (N > 0.5) {
            BigDecimal adnum = BigDecimal.valueOf(d + x * (N - 0.5));
            ans = ans.add(adnum);
            d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N);
            x = (1.0 + (2.0 / N)) * x;
            --N;
        }

        DecimalFormat format = new DecimalFormat("#.0");
        format.setMinimumFractionDigits(20);
        System.out.println(format.format(ans));
    }
}
```

### Response:
```python
import math

def atcoder_AGC007_C():
    N, d, x = map(float, input().split())
    ans = 0.0
    while N > 0.5:
        adnum = (d + x * (N - 0.5))
        ans += adnum
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        N -= 1
    print("{:.20f}".format(ans))

atcoder_AGC007_C()
```

Explanation:

- We first import the necessary modules for the program to work.
- We define a function `atcoder_AGC007_C()` which takes no arguments.
- We use the `input()` function to take input from the user and convert it into a list of three floating point numbers.
- We initialize the variable `ans` to 0.0.
- We use a while loop to iterate until `N` is less than or equal to 0.5.
- Inside the loop, we calculate the value of `adnum` which is the sum of `d` and `x` multiplied by `(N - 0.5)`.
- We add `adnum` to `ans`.
- We update the values of `d` and `x` using the given formula.
- We decrement `N` by 1.
- Finally, we use the `format()` function to format the output to 20 decimal places and print it to the console.<|endoftext|>
