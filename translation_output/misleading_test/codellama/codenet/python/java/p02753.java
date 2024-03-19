<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABA

Expected output:
Ye

```
S = str(input())

if S == 'AAA' or S == 'BBB':
    print('No')
else:
    print('Yes')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `equals()` method is used to compare the input string with the expected string.
* The `System.out.println()` method is used to print the output.

Note: The `import java.util.Scanner;` statement is used to import the `Scanner` class from the `java.util` package.</s>
