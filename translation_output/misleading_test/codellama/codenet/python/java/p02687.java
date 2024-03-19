<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABC

Expected output:
ARC

```
string = input()
if string == "ARC":
  print("ABC")
else:
  print("ARC")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to compare the input with the expected output. If the input is equal to "ARC", it prints "ABC", otherwise it prints "ARC".</s>
