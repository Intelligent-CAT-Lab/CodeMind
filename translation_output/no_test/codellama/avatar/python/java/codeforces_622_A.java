<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

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



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
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
        idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `int` data type is used for integer variables, and the `if` statement is used for conditional logic. The `while` loop is used to iterate until the desired condition is met.</s>
