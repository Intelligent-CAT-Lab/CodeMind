<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

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



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[][] factors = factorization(x);
        int[][] sortedFactors = sortFactors(factors);
        int ans = 0;
        for (int i = 0; i < sortedFactors.length; i++) {
            if (sortedFactors[i][0] == 1) {
                continue;
            } else {
                int s = 0;
                int num = sortedFactors[i][1];
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
        return factors;
    }

    public static int[][] sortFactors(int[][] factors) {
        int[][] sortedFactors = new int[factors.length][2];
        for (int i = 0; i < factors.length; i++) {
            sortedFactors[i] = factors[i];
        }
        Arrays.sort(sortedFactors, (a, b) -> a[0] - b[0]);
        return sortedFactors;
    }
}
```
Note that this code is not optimized for performance, and it may not be the most efficient way to solve the problem. However, it should give you an idea of how to translate the Python code to Java.</s>
