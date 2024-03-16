<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
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

This Java code does the same thing as the Python code you provided. It reads an integer from the user, then uses binary search to find the largest number `l` such that the sum of the first `l` natural numbers is less than or equal to `n`. It then prints the difference between `n` and the sum of the first `l` natural numbers.<｜end▁of▁sentence｜>
