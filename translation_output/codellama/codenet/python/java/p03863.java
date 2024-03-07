<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s=input()
if (s[0]==s[-1] and len(s)%2==0) or (s[0]!=s[-1] and len(s)%2==1):
 print("First")
else:
 print("Second")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) || (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `String` class is used to represent the input string. The `charAt()` method is used to access the characters in the string, and the `length()` method is used to get the length of the string. The `System.out.println()` method is used to print the output.</s>
