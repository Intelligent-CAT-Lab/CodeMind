<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

l = input ( ) [ : : - 1 ]
mod = 10 ** 9 + 7
pows = [ 1 ]
for i in range ( 10 ** 5 + 10 ) :
    pows . append ( ( pows [ - 1 ] * 3 ) % mod )
dp = 1
for i in range ( len ( l ) ) :
    if l [ i ] == '1' :
        dp = ( pows [ i ] + dp * 2 ) % mod
print ( dp )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int mod = 1000000007;
        int[] pows = new int[1000000 + 10];
        pows[0] = 1;
        for (int i = 1; i <= 1000000 + 10; i++) {
            pows[i] = (pows[i - 1] * 3) % mod;
        }
        int dp = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                dp = (pows[i] + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `charAt()` method to access the characters in the input string. The `mod` variable is used to calculate the modulus of the powers of 3, and the `dp` variable is used to store the result of the calculation. The `pows` array is used to store the powers of 3, and the `for` loop is used to calculate the powers of 3 up to 1000000 + 10. Finally, the `System.out.println()` method is used to print the result of the calculation.</s>
