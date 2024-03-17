<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99992

Expected output:
311


```
from cmd import IDENTCHARS
n = int ( input ( ) )
l = 1
r = n
while ( l < r ) :
    mid = l + ( r - l ) // 2
    idxcnt = mid * ( mid + 1 ) / 2
    if ( idxcnt < n ) :
        l = mid + 1
    else :
        r = mid
l -= 1
idxcnt = l * ( l + 1 ) / 2
print ( int ( n - idxcnt ) )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            long idxcnt = mid * (mid + 1L) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        long idxcnt = l * (l + 1L) / 2;
        System.out.println((int) (n - idxcnt));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then uses binary search to find the largest number `l` such that `l * (l + 1) / 2 <= n`. The result is then `n - l * (l + 1) / 2`.

Please note that in Java, the division of two integers results in an integer, so we need to cast one of the operands to `long` to ensure that the division operation is performed in floating-point arithmetic, not integer arithmetic.
<|EOT|>
