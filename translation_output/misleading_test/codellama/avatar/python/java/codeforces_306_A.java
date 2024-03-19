<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
87 34

Expected output:
2 2 2 2 2 2 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3

```
n , m = map ( int , input ( ) . split ( ) )
q = n // m
r = n % m
a = [ q ] * m
for i in range ( r ) :
    a [ i ] += 1
for i in range ( m ) :
    print ( a [ i ] , end = ' â ' )


```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = n / m;
        int r = n % m;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = q;
        }
        for (int i = 0; i < r; i++) {
            a[i]++;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
```
This code first prompts the user to enter two integers `n` and `m` separated by a space. It then calculates the quotient `q` and remainder `r` of `n` divided by `m`. It then creates an array `a` of size `m` and initializes each element to `q`. Finally, it loops through the array and increments the first `r` elements by 1. Finally, it prints the elements of the array separated by a space.

Note that the code uses the `Scanner` class to read input from the user, and the `System.out.print()` method to print the output.</s>
