<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
59 96

Expected output:
155 245

```
n, m = map ( int, input ( ). split ( ) )
if n < 1 :
    if m < 1 :
        print ( n, m )
        quit ( )
    print ( " Impossible " )
    quit ( )
if m > n :
    min = m
    max = n + m - 1
    print ( min, max )
if m <= n :
    min = n
    max = n + m - 1
    if m == 0 :
        max = n
    print ( min, max )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                return;
            }
            System.out.println("Impossible");
            return;
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        }
        if (m <= n) {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```
<|endoftext|>
