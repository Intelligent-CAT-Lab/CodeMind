<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import math
n = int ( input ( ) )
x = 1
while math . log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math . log2 ( n ) ) )
print ( x )


```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log2(n) % 1 != 0) {
            x += 1;
            n -= 2 ** (int) Math.log2(n);
        }
        System.out.println(x);
    }
}
```
</s>
