<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
hihi

Expected output:
YMs

```
S = input() 
if (S == 'hi' or S == 'hihi' or S == 'hihihi' or S == 'hihihihi' or S == 'hihihihihi'):
  print('Yes')
else:
  print('No')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("hi") || input.equals("hihi") || input.equals("hihihi") || input.equals("hihihihi") || input.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `equals()` method is used to compare the input with the expected string.</s>
