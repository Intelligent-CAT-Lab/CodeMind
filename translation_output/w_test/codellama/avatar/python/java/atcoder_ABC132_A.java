<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
STOP

Expected output:
No


```
s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ] != s [ 2 ] : print ( ' Yes ' )
else : print ( ' No ' )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        if (chars[0] == chars[1] && chars[2] == chars[3] && chars[0] != chars[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `String` class is used to store the input string.
* The `char[]` array is used to store the characters of the input string.
* The `Arrays.sort()` method is used to sort the characters of the input string in ascending order.
* The `if` statement is used to check if the first and second characters of the sorted string are the same, and if the third and fourth characters of the sorted string are the same, and if the first and third characters of the sorted string are different.
* If all of these conditions are true, the program prints "Yes" to the console. Otherwise, it prints "No" to the console.

Test case:

Input:
STOP

Output:
No</s>
