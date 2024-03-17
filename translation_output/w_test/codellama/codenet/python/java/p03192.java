<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1222

Expected output:
3


```
N = raw_input()
print len([i for i in N if i == '2'])

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int count = 0;
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then uses a `for` loop to iterate over the characters in the input string. For each character, it checks if it is equal to the character '2', and if so, it increments a counter variable. Finally, it prints the value of the counter variable, which is the number of times the character '2' appeared in the input string.</s>
