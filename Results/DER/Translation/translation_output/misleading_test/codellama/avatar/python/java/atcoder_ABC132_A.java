<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
STOP

Expected output:
N<

```
s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ] != s [ 2 ] : print ( ' Yes ' )
else : print ( ' No ' )


```
[/INST]
```
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
This code uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the input string. It then checks if the first and second characters are the same, and if the third and fourth characters are the same, and if the first and third characters are different. If all of these conditions are true, it prints "Yes", otherwise it prints "No".</s>
