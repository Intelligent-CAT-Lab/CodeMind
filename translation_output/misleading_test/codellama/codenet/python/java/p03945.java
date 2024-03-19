<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
101

```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        String input = "BBBWW";
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'W' && input.charAt(i + 1) == 'B') {
                count++;
            } else if (input.charAt(i) == 'B' && input.charAt(i + 1) == 'W') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code uses a for loop to iterate over the characters in the input string, and checks if the current character is 'W' and the next character is 'B', or if the current character is 'B' and the next character is 'W'. If either of these conditions is true, the count variable is incremented. Finally, the count variable is printed to the console.</s>
