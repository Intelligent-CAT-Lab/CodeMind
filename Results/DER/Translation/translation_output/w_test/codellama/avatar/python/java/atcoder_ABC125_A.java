<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 20 19

Expected output:
0


```
A , B , T = map ( int , input ( ) . split ( ) )
ans = ( T // A ) * B
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int T = scanner.nextInt();
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}
```

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into three parts, separated by spaces.
* The `map()` method is used to convert the input strings to integers.
* The `ans` variable is used to store the result of the calculation.
* The `print()` method is used to print the result to the console.

Note: The `map()` method is not available in Java, so you will need to use a different method to convert the input strings to integers.</s>
