<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

mod = 10 ** 9 + 7
n , k = map ( int , input ( ) . split ( ) )
coef = [ ]
for i in range ( 1 , int ( n ** 0.5 ) + 1 ) :
    coef . append ( ( n // i ) - ( n // ( i + 1 ) ) )
coef += [ 1 ] * ( n - sum ( coef ) )
coef = coef [ : : - 1 ]
nn = len ( coef )
dp = [ [ 0 ] * nn for _ in range ( k + 1 ) ]
dp [ 0 ] [ 0 ] = 1
for i in range ( 1 , k + 1 ) :
    tmp = 0
    for j in range ( nn - 1 , - 1 , - 1 ) :
        tmp += dp [ i - 1 ] [ ( nn - 1 ) - j ]
        tmp %= mod
        dp [ i ] [ j ] = coef [ j ] * tmp
        dp [ i ] [ j ] %= mod
print ( sum ( dp [ k ] ) % mod )



Translate the above python code to java.

java Code:

[/INST]
```
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            coef[i] = (n / i) - (n / (i + 1));
        }
        coef[n] = 1;
        int nn = coef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][(nn - 1) - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        System.out.println(sum(dp[k]) % mod);
    }

    private static int sum(int[][] dp) {
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                sum += dp[i][j];
            }
        }
        return sum;
    }
}
```
This is the Java code for the given Python code. It uses the same logic and data structures as the Python code, but with Java syntax. The `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print the output. The `sum()` method is used to calculate the sum of the elements in the `dp` array.</s>
