<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600336


```
a , b = input ( ) . split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1].substring(0, input[1].length() - 1));
        System.out.println(a + b);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the console.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `Integer.parseInt()` method is used to convert the input strings to integers.
* The `substring()` method is used to extract the last digit of the second input string.
* The `System.out.println()` method is used to print the sum of the two integers.

Note: The `Scanner` class is used instead of `System.in.readLine()` because it is more convenient and easier to use.</s>
