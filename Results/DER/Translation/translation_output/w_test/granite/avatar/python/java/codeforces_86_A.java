System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 999999999

Expected output:
0

```
l, r = [ int ( x ) for x in input ( ). split ( ) ]
curr = r
s = 0
while curr :
    s += 1
    curr //= 10
first = 10 ** s
second = first // 2
ans = - 1
for i in [ l, r, first, second ] :
    if i >= l and i <= r :
        curr = i
        rev =''
        for k in str ( curr ) :
            rev += str ( 9 - int ( k ) )
        ans = max ( ans, int ( rev ) * curr )
print ( ans )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        for (long i : new long[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (char k : Long.toString(curr).toCharArray()) {
                    rev += (9 - Integer.parseInt(String.valueOf(k)));
                }
                ans = Math.max(ans, Long.parseLong(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```

You can run this code with the following test case:

```
999999999 999999999
```

The expected output is:

```
0
```<|endoftext|>
