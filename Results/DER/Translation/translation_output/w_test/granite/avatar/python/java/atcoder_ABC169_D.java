System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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
    for i in range ( 2, int ( - ( - n ** 0.5 // 1 ) ) + 1 ) :
        if temp % i == 0 :
            cnt = 0
            while temp % i == 0 :
                cnt += 1
                temp //= i
            arr. append ( [ i, cnt ] )
    if temp!= 1 :
        arr. append ( [ temp, 1 ] )
    if arr == [ ] :
        arr. append ( [ n, 1 ] )
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
            for j in range ( 1, num ) :
                s += j
                if s == num :
                    break
                elif s > num :
                    j -= 1
                    break
        ans += j
print ( ans )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        List<long[]> factors = factorization(x);
        factors.sort(Comparator.comparingLong(a -> a[0]));
        long ans = 0;
        for (long[] factor : factors) {
            if (factor[0] == 1) {
                continue;
            } else {
                long s = 0;
                long num = factor[1];
                long j = 1;
                while (s < num) {
                    s += j;
                    if (s == num) {
                        break;
                    } else if (s > num) {
                        j--;
                        break;
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    public static List<long[]> factorization(long n) {
        List<long[]> arr = new ArrayList<>();
        long temp = n;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                long cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new long[]{i, cnt});
            }
        }
        if (temp!= 1) {
            arr.add(new long[]{temp, 1});
        }
        if (arr.isEmpty()) {
            arr.add(new long[]{n, 1});
        }
        return arr;
    }
}
```<|endoftext|>
