<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][] factors = factorization(x);
        int ans = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i][0] == 1) {
                continue;
            } else {
                int num = factors[i][1];
                int j = 1;
                if (num == 1) {
                    j = 1;
                } else {
                    for (int j = 1; j < num; j++) {
                        if (j * (j + 1) / 2 == num) {
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    public static int[][] factorization(int n) {
        int[][] factors = new int[n][2];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                factors[i] = new int[] { i, cnt };
            }
        }
        if (temp != 1) {
            factors[temp] = new int[] { temp, 1 };
        }
        if (factors.length == 0) {
            factors[n] = new int[] { n, 1 };
        }
        return factors;
    }
}
```
Note that the `factorization` method in the Java code is similar to the `factorization` function in the Python code, but it returns an array of arrays, where each subarray contains the prime factor and its exponent. The `main` method in the Java code is similar to the `main` function in the Python code, but it uses a `Scanner` object to read the input and a `System.out.println` statement to print the output.</s>
