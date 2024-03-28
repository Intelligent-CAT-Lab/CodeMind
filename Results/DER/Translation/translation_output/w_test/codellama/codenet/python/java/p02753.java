<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABA

Expected output:
Yes


```
S = str(input())

if S == 'AAA' or S == 'BBB':
    print('No')
else:
    print('Yes')
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `String` class is used to store the input as a string. The `equals()` method is used to compare the input with the expected strings.</s>
