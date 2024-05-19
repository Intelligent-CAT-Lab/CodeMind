System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
77777777

Expected output:
4444477777


```
l = [ ]
limit = 10000000000
def gen ( number, four, seven ) :
    if ( number > limit ) :
        return
    if ( number > 0 and four == seven ) :
        l. append ( number )
    gen ( number * 10 + 4, four + 1, seven )
    gen ( number * 10 + 7, four, seven + 1 )
def main ( ) :
    gen ( 0, 0, 0 )
    l. sort ( )
    n = int ( input ( ) )
    ans = 0
    for val in l :
        if ( val >= n ) :
            ans = val
            break
    print ( ans )
main ( )


```


Answer:
```java
import java.util.*;

public class Main {
    static List<Long> l = new ArrayList<>();
    static long limit = 10000000000L;

    public static void gen(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }

    public static void main(String[] args) {
        gen(0, 0, 0);
        Collections.sort(l);
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

Test input:
777777777

Expected output:
44444477777<|endoftext|>
