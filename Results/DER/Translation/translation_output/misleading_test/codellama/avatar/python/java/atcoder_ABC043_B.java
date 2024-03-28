<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
-87

```
s = str ( input ( ) )
my_str = ' '
for c in s :
    if c == '0' or c == '1' :
        my_str += c
    elif c == ' B ' and len ( my_str ) != 0 :
        my_str = my_str [ : len ( my_str ) - 1 ]
print ( my_str )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String myStr = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '0' || c == '1') {
                myStr += c;
            } else if (c == 'B' && myStr.length() != 0) {
                myStr = myStr.substring(0, myStr.length() - 1);
            }
        }
        System.out.println(myStr);
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then loops through each character in the input string using a `for` loop. If the character is a `0` or a `1`, it appends it to the `myStr` string. If the character is a `B` and the `myStr` string is not empty, it removes the last character from the `myStr` string using the `substring` method. Finally, it prints the resulting `myStr` string to the console.

Note that this code assumes that the input string only contains the characters `0`, `1`, and `B`. If the input string contains any other characters, the code will not work correctly.</s>
