<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
H H

Expected output:


```
a,b=input().split()

if a=='H':
  print(b)
else:
  if b=='H':
    print('D')
  else:
    print('H')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        String a = tokens[0];
        String b = tokens[1];

        if (a.equals("H")) {
            System.out.println(b);
        } else {
            if (b.equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `split()` method is used to split the input string into two parts based on the space character. The `equals()` method is used to compare the two strings.</s>
