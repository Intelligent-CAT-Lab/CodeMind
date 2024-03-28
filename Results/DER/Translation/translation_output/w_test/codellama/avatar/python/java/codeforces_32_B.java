<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
..

Expected output:
00


```
s = input ( )
result = " "
i = 0
while i < len ( s ) :
    if s [ i ] == " . " :
        result += '0'
    else :
        i += 1
        if s [ i ] == " . " :
            result += '1'
        else :
            result += '2'
    i += 1
print ( result )


```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                result += "0";
            } else if (input.charAt(i) == ' ') {
                result += "1";
            } else {
                result += "2";
            }
        }
        System.out.println(result);
    }
}
```
This code uses a `Scanner` to read the input from the user, and then it iterates over the characters of the input string using a `for` loop. For each character, it checks if it is a dot (`.`) or a space (` `), and if it is, it adds the corresponding digit to the result string. If the character is neither a dot nor a space, it adds the digit `2` to the result string. Finally, it prints the result string to the console.</s>
