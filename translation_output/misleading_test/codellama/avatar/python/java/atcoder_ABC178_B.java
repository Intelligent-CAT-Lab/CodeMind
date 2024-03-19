<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
418379342 802780784 -790013317 -445130206

Expected output:
-186233282690604538

```
a , b , c , d = map ( int , input ( ) . split ( ) )
ans = max ( a * c , a * d , b * c , b * d )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        int ans = Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d)));
        System.out.println(ans);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `split()` method is used to split the input string into an array of strings, where each element is a number.
* The `parseInt()` method is used to convert each string to an integer.
* The `Math.max()` method is used to find the maximum of four numbers.
* The `System.out.println()` method is used to print the result.

Note: The `Math.max()` method can also be used to find the maximum of more than four numbers, by passing in multiple arguments. For example, `Math.max(a, b, c, d)` will find the maximum of the four numbers `a`, `b`, `c`, and `d`.</s>
