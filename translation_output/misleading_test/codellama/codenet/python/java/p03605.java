<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
29

Expected output:
Ys

```
if '9' in input():
    print('Yes')
else:
    print('No')
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        String input = args[0];
        if (input.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code takes a single command-line argument, which is the input string. It then checks if the input string contains the character "9". If it does, it prints "Yes" to the console. If it doesn't, it prints "No" to the console.

Here's an example of how to run this code:
```
$ java Solution 29
Yes
```
This will print "Yes" to the console because the input string "29" contains the character "9".</s>
