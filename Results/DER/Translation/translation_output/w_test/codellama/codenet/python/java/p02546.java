<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
apple

Expected output:
apples


```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.endsWith("s")) {
            System.out.println(input + "es");
        } else {
            System.out.println(input + "s");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `endsWith` method to check if the input string ends with the letter "s". If it does, it prints the input string followed by "es", otherwise it prints the input string followed by "s".</s>
