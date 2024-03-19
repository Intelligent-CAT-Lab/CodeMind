<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
366735600000

Expected output:
77

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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        List<List<Long>> l = factorization(x);
        l.sort(Comparator.comparingLong(a -> a.get(0)));
        long ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).get(0) == 1)
                continue;
            else {
                long s = 0;
                long num = l.get(i).get(1);
                if (num == 1)
                    ans += 1;
                else {
                    for (long j = 1; j < num; j++) {
                        s += j;
                        if (s == num)
                            break;
                        else if (s > num) {
                            j--;
                            break;
                        }
                    }
                    ans += j;
                }
            }
        }
        System.out.println(ans);
    }

    private static List<List<Long>> factorization(long n) {
        List<List<Long>> arr = new ArrayList<>();
        long temp = n;
        for (long i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
            if (temp % i == 0) {
                long cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(Arrays.asList(i, cnt));
            }
        }
        if (temp != 1)
            arr.add(Arrays.asList(temp, 1L));
        if (arr.isEmpty())
            arr.add(Arrays.asList(n, 1L));
        return arr;
    }
}
```

This Java code does the same thing as your Python code. It takes a long integer as input, factors it into its prime factors and counts the occurrences of each prime factor. Then it sums up the counts of prime factors that are greater than 1.
<|EOT|>
