<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
366735600000

Expected output:
10


```
x = int ( input ( ) )
def factorization ( n ) :
    arr = [ ]
    temp = n
    for i in range ( 2 , int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr . append ( [ i , cnt ] )
    if temp != 1 :
        arr . append ( [ temp , 1 ] )
    if arr == [ ] :
        arr . append ( [ n , 1 ] )
    return arr
l = factorization ( x )
l = sorted ( l )
ans = 0
for i in range ( len ( l ) ) :
    if l [ i ] [ 0 ] == 1 :
        continue
    else :
        s = 0
        num = l [ i ] [ 1 ]
        if num == 1 :
            j = 1
        else :
            for j in range ( 1 , num ) :
                s += j
                if s == num :
                    break
                elif s > num :
                    j -= 1
                    break
        ans += j
print ( ans )


```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        List<List<Long>> l = factorization(x);
        l.sort(Comparator.comparingLong(o -> o.get(0)));
        long ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).get(0) == 1) {
                continue;
            } else {
                long s = 0;
                long num = l.get(i).get(1);
                if (num == 1) {
                    long j = 1;
                } else {
                    for (long j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j -= 1;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    private static List<List<Long>> factorization(long n) {
        List<List<Long>> arr = new ArrayList<>();
        long temp = n;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                long cnt = 0;
                while (temp % i == 0) {
                    cnt += 1;
                    temp /= i;
                }
                List<Long> pair = new ArrayList<>();
                pair.add(i);
                pair.add(cnt);
                arr.add(pair);
            }
        }
        if (temp != 1) {
            List<Long> pair = new ArrayList<>();
            pair.add(temp);
            pair.add(1L);
            arr.add(pair);
        }
        if (arr.isEmpty()) {
            List<Long> pair = new ArrayList<>();
            pair.add(n);
            pair.add(1L);
            arr.add(pair);
        }
        return arr;
    }
}
```

This Java code does the same thing as the Python code. It reads a long integer from the standard input, factorizes it, sorts the factors, and then calculates the answer. The factorization method is implemented in the `factorization` method, and the main method is the entry point of the program.<｜end▁of▁sentence｜>
