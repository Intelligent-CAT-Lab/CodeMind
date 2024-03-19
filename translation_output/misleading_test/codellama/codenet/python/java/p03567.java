<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BACD

Expected output:
&*s

```
S = input()
if S.count("AC") >= 1:
  print("Yes")
else:
  print("No")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.contains("AC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then checks if the input string contains the substring "AC". If it does, it prints "Yes", otherwise it prints "No".</s>
