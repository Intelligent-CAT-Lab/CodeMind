<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A

Expected output:


```
b=input()
if b =='A':
    print('T')
elif b=='C':
    print('G')
elif b=='G':
    print('C')
else:
    print('A')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("A")) {
            System.out.println("T");
        } else if (input.equals("C")) {
            System.out.println("G");
        } else if (input.equals("G")) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `nextLine()` method is used to read a line of input from the user. The `equals()` method is used to compare the input with a specific string.</s>
