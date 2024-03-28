Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 9 49

Expected output:
-45.96915777646216

```
import java.util.Scanner;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double tmp1 = sc.nextDouble();
        double tmp2 = sc.nextDouble();
        
        double h = tmp1 / 6. * Math.PI + tmp2 / 30. * Math.PI / 12.;
        double m = tmp2 / 30. * Math.PI + tmp1 / 6. * Math.PI * 12.;
        double rad = h - m;
        
        double res = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2. * a * b * Math.cos(rad)));
        
        System.out.println(res);
    }
}
```

### Response:
```python
import math
import sys

input = sys.stdin.readline

a, b, tmp1, tmp2 = map(int, input().split())

h = (tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.)
m = (tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.)
rad = h - m

res = math.sqrt(a**2 + b**2 - 2*a*b*math.cos(rad))

print(res)
```

Explanation:

- We first import the necessary modules, `math` and `sys`.
- We use `sys.stdin.readline()` to read input from the standard input stream.
- We use `map(int, input().split())` to read the input values as integers and split them using whitespace as the delimiter.
- We calculate the values of `h`, `m`, and `rad` using the given formulas.
- We calculate the value of `res` using the given formula.
- We print the value of `res` to the standard output stream.<|endoftext|>
