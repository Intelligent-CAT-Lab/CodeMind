<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            int cnt = 0;
            while (x % i == 0) {
                cnt++;
                x /= i;
            }
            if (cnt > 0) {
                ans += cnt;
            }
        }
        if (x > 1) {
            ans++;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
