<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
0


```
a , b , c , d = map ( int , input ( ) . split ( ) )
print ( max ( 0 , min ( b , d ) - max ( a , c ) ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int max = Math.max(0, Math.min(b, d) - Math.max(a, c));
        System.out.println(max);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the console.
* The `split()` method is used to split the input string into an array of strings, where each element is a number.
* The `parseInt()` method is used to convert each string to an integer.
* The `Math.max()` method is used to find the maximum value between 0 and the difference between the minimum of `b` and `d` and the maximum of `a` and `c`.
* The `System.out.println()` method is used to print the result.

Note: The `Math.max()` method returns the maximum value between two or more numbers. The `Math.min()` method returns the minimum value between two or more numbers.</s>
