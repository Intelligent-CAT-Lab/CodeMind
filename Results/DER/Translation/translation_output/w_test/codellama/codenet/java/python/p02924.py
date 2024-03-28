<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1


```
import java.util.Scanner;

public class p02924 {

    public static void main(String args[]) {

        // å¥å
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // ä¸»å¦ç
        long result = 0;
        for (int i = n - 1; 0 < i; i--) {
            result += i;
        }

        // åºå
        System.out.println(result);
        sc.close();
    }

}
```
[/INST]
```
import sys

n = int(sys.stdin.readline())
result = 0
for i in range(n-1, 0, -1):
    result += i
print(result)
```
Explanation:

* `sys.stdin.readline()` is used to read a line of input from the standard input stream.
* `int(sys.stdin.readline())` is used to convert the input string to an integer.
* `range(n-1, 0, -1)` is used to create a range of numbers from `n-1` to `0` with a step size of `-1`.
* `result += i` is used to add the current number to the result.
* `print(result)` is used to print the final result.</s>
