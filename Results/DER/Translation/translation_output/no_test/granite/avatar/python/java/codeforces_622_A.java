System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
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
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        int idxcnt = l * (l + 1) / 2;
        System.out.println(int(n - idxcnt));
    }
}
```<|endoftext|>
