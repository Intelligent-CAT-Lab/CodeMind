<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 1000000000 1000

Expected output:
0

```
k , n , w = map ( int , input ( ) . strip ( ) . split ( ) )
sum = 0
for i in range ( 1 , w + 1 ) :
    sum += k * i
if sum <= n :
    print ( 0 )
else :
    print ( sum - n )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the console.
* The `split()` method is used to split the input string into an array of strings, where each element is a space-separated token.
* The `parseInt()` method is used to convert each token into an integer.
* The `for` loop is used to calculate the sum of the first `w` multiples of `k`.
* The `if` statement is used to check if the sum is less than or equal to `n`. If it is, the program prints `0`. Otherwise, it prints the difference between the sum and `n`.

Note: The `strip()` method is not necessary in this case, as the input string does not contain any leading or trailing whitespace.</s>
