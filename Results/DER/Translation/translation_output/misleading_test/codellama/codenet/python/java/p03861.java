<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 8 2

Expected output:
14

```
_input = list(map(int, input().split(" ")))
a = _input[0]
b = _input[1]
x = _input[2]

result = b // x - (a - 1)// x

print(result)
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
        int x = Integer.parseInt(input[2]);

        int result = b / x - (a - 1) / x;

        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into an array of strings. The `parseInt()` method is used to convert the strings to integers. The calculation is then performed using the `/` operator, and the result is printed to the console using the `println()` method.</s>
