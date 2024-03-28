<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1 1000000000

Expected output:
1000000018

```
def GCD ( a, b ) :
    while a % b!= 0 :
        a, b = b, a % b
    return b
def LCM ( a, b ) :
    return a * b // GCD ( a, b )
l = input ( ). split ('â')
x, y, a, b = int ( l [ 0 ] ), int ( l [ 1 ] ), int ( l [ 2 ] ), int ( l [ 3 ] )
lcm = LCM ( x, y )
print ( b // lcm - ( a - 1 ) // lcm )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);
        int lcm = x * y / gcd(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int gcd(int a, int b) {
        while (a % b!= 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
}
```

'''
<|endoftext|>
