<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000000


```
vamshi , z = map ( int , input ( ) . split ( ) )
print ( ( vamshi // z + 1 ) * z )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int vamshi = Integer.parseInt(numbers[0]);
        int z = Integer.parseInt(numbers[1]);
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `parseInt()` method is used to convert the two parts of the input string into integers.
* The calculation is performed using the `/` operator to divide `vamshi` by `z`, and the `+` operator to add 1 to the result.
* The result is then multiplied by `z` using the `*` operator.
* The `System.out.println()` method is used to print the result to the console.</s>
