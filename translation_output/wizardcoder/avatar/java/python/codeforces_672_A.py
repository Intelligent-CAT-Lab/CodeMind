Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.ceil;

public class codeforces_672_A {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        String s = " ";
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        out.print(s.charAt(n - 1));
        out.close();
    }
}
```

### Response:
```python
import math

in_ = input()
n = int(in_)
s = " "
for i in range(1, n+1):
    s += str(i)
out_ = s[n-1]
print(out_)
```

Explanation:

- We import the `math` module to use the `ceil` function.
- We read the input from the user and convert it to an integer using `int()`.
- We initialize an empty string `s` to store the sequence of numbers.
- We use a `for` loop to iterate from 1 to `n` and append each number to the string `s` using the `+=` operator.
- We use the `charAt()` method to get the last character of the string `s` and store it in the variable `out_`.
- We print the output using the `print()` function.<|endoftext|>
