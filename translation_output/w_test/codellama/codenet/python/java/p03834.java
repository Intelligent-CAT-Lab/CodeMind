<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
happy newyear enjoy


```
s = input()
print(s.replace(",", " "))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `replace` method is used to replace all occurrences of the comma character (`,`) with a space character (` `). Finally, the modified string is printed to the console using the `System.out.println` method.</s>
