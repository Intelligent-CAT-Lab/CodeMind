System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static int GCD(int a, int b) {
        while (a % b!= 0) {
            a = b;
            b = a % b;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" â ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);
        int lcm = LCM(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }
}
```

Test input:
1 1 1 10000000000

Expected output:
1000000018<|endoftext|>
