<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99992

Expected output:
405

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        int idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```
This code uses the same approach as the Python code, but it is written in Java. It first prompts the user to enter a number, and then it uses a binary search to find the smallest number that has at least that many divisors. The binary search works by starting with the range of all possible numbers (1 to n), and then repeatedly dividing the range in half until it finds the smallest number that has at least the desired number of divisors. The code then prints the difference between the desired number of divisors and the actual number of divisors of the smallest number.</s>
