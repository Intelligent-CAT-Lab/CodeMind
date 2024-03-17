<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
59 96

Expected output:
96 154

```
n , m = map ( int , input ( ) . split ( ) )
if n < 1 :
    if m < 1 :
        print ( n , m )
        quit ( )
    print ( " Impossible " )
    quit ( )
if m > n :
    min = m
    max = n + m - 1
    print ( min , max )
if m <= n :
    min = n
    max = n + m - 1
    if m == 0 :
        max = n
    print ( min , max )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                return;
            }
            System.out.println("Impossible");
            return;
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        } else {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```
Explanation:

* The code first reads two integers `n` and `m` from the standard input using the `Scanner` class.
* It then checks if `n` is less than 1 and if `m` is less than 1. If both conditions are true, it prints the values of `n` and `m` and returns.
* If `n` is less than 1 but `m` is greater than or equal to 1, it prints "Impossible" and returns.
* If `m` is greater than `n`, it calculates the minimum and maximum values of the range and prints them.
* If `m` is less than or equal to `n`, it calculates the minimum and maximum values of the range and prints them. If `m` is equal to 0, it sets the maximum value to `n`.

Note: The code assumes that the input values are valid and does not perform any error handling.</s>
