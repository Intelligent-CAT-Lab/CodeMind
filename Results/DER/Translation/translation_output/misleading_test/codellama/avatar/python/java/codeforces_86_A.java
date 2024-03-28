<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 999999999

Expected output:
98

```
l , r = [ int ( x ) for x in input ( ) . split ( ) ]
curr = r
s = 0
while curr :
    s += 1
    curr //= 10
first = 10 ** s
second = first // 2
ans = - 1
for i in [ l , r , first , second ] :
    if i >= l and i <= r :
        curr = i
        rev = ' '
        for k in str ( curr ) :
            rev += str ( 9 - int ( k ) )
        ans = max ( ans , int ( rev ) * curr )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i = l; i <= r; i++) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (int k = 0; k < String.valueOf(curr).length(); k++) {
                    rev += (9 - Integer.parseInt(String.valueOf(curr).charAt(k))) + "";
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```
This code first takes input from the user and splits it into two integers `l` and `r`. It then calculates the number of digits in `r` using a while loop and calculates the first and second powers of 10 using the `Math.pow()` method.

Next, it iterates through the range of numbers from `l` to `r` and for each number `i`, it calculates the reverse of `i` using a for loop and checks if the reverse is a palindrome. If it is, it calculates the product of the reverse and `i` and updates the maximum product `ans` if it is greater than the current value of `ans`.

Finally, it prints the maximum product `ans` to the console.</s>
