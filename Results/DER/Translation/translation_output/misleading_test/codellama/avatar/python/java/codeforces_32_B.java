<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
..

Expected output:
76

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
        String s = scanner.nextLine();
        String result = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i++;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i++;
        }
        System.out.println(result);
    }
}
```
This code uses a `Scanner` to read input from the user, and then it uses a `while` loop to iterate over the characters in the input string. For each character, it checks if it is a dot (`.`) and if it is, it adds a `0` to the result string. If the character is not a dot, it increments the index `i` and checks if the next character is a dot. If it is, it adds a `1` to the result string. If the next character is not a dot, it adds a `2` to the result string. Finally, it prints the result string.

Note that this code assumes that the input string only contains characters `.` and ` ` (space). If the input string contains any other characters, the code may not work as expected.</s>
