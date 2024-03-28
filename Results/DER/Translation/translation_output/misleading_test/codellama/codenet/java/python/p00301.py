<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
25

Expected output:
+0-+

```
import java.util.Scanner;
// 0306
class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[15],i=0;
        while(n>0) {
            a[i++]=(n+1)%3-1;
            n=(n-a[i-1])/3;
        }
        while(i-->0)
            System.out.print((a[i]==0?"0":a[i]>0?"+":"-")+(i==0?"\n":""));
    }
}

```
[/INST]
```python
import sys

n = int(sys.stdin.readline())
a = [0] * 15
i = 0

while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

for i in range(i - 1, -1, -1):
    print((a[i] == 0) * "0" + (a[i] > 0) * "+" + (a[i] < 0) * "-" + (i == 0) * "\n")
```

Explanation:

* `import sys` is used to import the `sys` module, which provides access to the standard input and output streams.
* `n = int(sys.stdin.readline())` reads a line of input from the standard input stream and converts it to an integer.
* `a = [0] * 15` creates a list of 15 zeros.
* `i = 0` initializes a variable `i` to 0.
* `while n > 0:` starts a loop that continues as long as `n` is greater than 0.
* `a[i] = (n + 1) % 3 - 1` calculates the remainder of `n + 1` divided by 3 and subtracts 1. This is equivalent to the Java code `a[i] = (n + 1) % 3 - 1`.
* `n = (n - a[i]) // 3` calculates the quotient of `n - a[i]` divided by 3. This is equivalent to the Java code `n = (n - a[i]) / 3`.
* `i += 1` increments the value of `i` by 1.
* `for i in range(i - 1, -1, -1):` starts a loop that iterates over the indices of the `a` list in reverse order.
* `print((a[i] == 0) * "0" + (a[i] > 0) * "+" + (a[i] < 0) * "-" + (i == 0) * "\n")` prints the value of `a[i]` followed by a newline character if `i` is 0. The `* "0"` and `* "+" ` operators are used to convert the boolean values `a[i] == 0` and `a[i] > 0` to strings, and the `* "-"` operator is used to convert the boolean value `a[i] < 0` to a string. The `+` operator is used to concatenate the strings.</s>
