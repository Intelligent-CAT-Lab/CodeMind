<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Factorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[][] factors = factorization(x);
        int ans = 0;
        for (int i = 0; i < factors.length; i++) {
            int prime = factors[i][0];
            int power = factors[i][1];
            if (prime == 1) {
                continue;
            } else {
                int s = 0;
                int num = power;
                if (num == 1) {
                    int j = 1;
                } else {
                    for (int j = 1; j <= num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j--;
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
        int[][] arr = new int[n][2];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr[i] = new int[] { i, cnt };
            }
        }
        if (temp != 1) {
            arr[temp] = new int[] { temp, 1 };
        }
        if (arr.length == 0) {
            arr[n] = new int[] { n, 1 };
        }
        return arr;
    }
}
```
This code is a Java implementation of the Python code provided. It uses the same algorithm to find the prime factors of a number and calculate the sum of the digits of the prime factors. The `factorization` method is similar to the `factorization` function in the Python code, it takes an integer `n` as input and returns an array of arrays, where each subarray contains a prime factor and its power. The `main` method takes an integer `x` as input, calculates the prime factors of `x` using the `factorization` method, and then calculates the sum of the digits of the prime factors. Finally, it prints the result.

Note that the `factorization` method in this code is slightly different from the `factorization` function in the Python code, as it returns an array of arrays instead of a list of lists. This is because Java does not have a built-in list data structure, so we need to use an array of arrays instead.</s>
