Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

n = int(input())
s = " "
for i in range(1, n+1):
    s += str(i)
print(s[n-1])
```

Explanation:

In Python, we can use the `input()` function to read input from the user and the `print()` function to output the result. We can also use the `math` module to get the ceiling value of a number.

In the given Java code, we first read the input integer `n` from the user using the `BufferedReader` and `readLine()` methods. We then create a string `s` and use a loop to append the numbers from 1 to `n` to the string. Finally, we output the last character of the string using the `charAt()` method.

In Python, we can achieve the same functionality using the `input()` function to read the input integer `n` and the `print()` function to output the last character of the string. We can also use the `math.ceil()` function to get the ceiling value of `n`.

We create an empty string `s` and use a loop to append the numbers from 1 to `n` to the string using the `+=` operator. We then use the `print()` function to output the last character of the string using the index `n-1`.<|endoftext|>
