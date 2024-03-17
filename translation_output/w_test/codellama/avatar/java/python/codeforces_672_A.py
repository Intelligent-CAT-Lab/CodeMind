<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
952

Expected output:
3

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
[/INST]
```python
import math

def get_digit(n):
    s = ""
    for i in range(1, n+1):
        s += str(i)
    return s[n-1]

n = int(input())
print(get_digit(n))
```
Explanation:

The code first defines a function `get_digit` that takes an integer `n` as input and returns the digit at position `n-1` in the string representation of the numbers from 1 to `n`.

The function first initializes an empty string `s`. Then, it loops through the numbers from 1 to `n` and appends each number to the string `s`.

Finally, the function returns the character at position `n-1` in the string `s`.

The main function takes an integer `n` as input, calls the `get_digit` function with `n` as an argument, and prints the result.

Note that the `math.ceil` function is not needed in Python, as the integer division in Python already rounds up to the nearest integer.</s>
