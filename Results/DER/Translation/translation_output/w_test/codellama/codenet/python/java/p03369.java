<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxo

Expected output:
900


```
s = input()
print(700+100*s.count("o"))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(700 + 100 * count);
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then uses a `for` loop to count the number of occurrences of the character 'o' in the input string. The count is then used to calculate the output value, which is printed to the console.</s>
