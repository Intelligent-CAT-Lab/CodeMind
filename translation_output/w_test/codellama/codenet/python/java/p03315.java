<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
+-++

Expected output:
2


```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int plusCount = 0;
        int minusCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+') {
                plusCount++;
            } else if (c == '-') {
                minusCount++;
            }
        }
        System.out.println(plusCount - minusCount);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then it uses a `for` loop to iterate over the characters in the input string. For each character, it checks if it is a `+` or a `-`, and if it is, it increments the corresponding counter. Finally, it prints the difference between the number of `+` characters and the number of `-` characters.</s>
