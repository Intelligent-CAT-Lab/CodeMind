<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s=input()
count=0
for member in s:
    count=0
    for member2 in s:
        if member2==member:
            count+=1
    if count>=2:
        print("no")
        break
if count==1:
    print("yes")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cCount = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    cCount++;
                }
            }
            if (cCount >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to manipulate strings. The `charAt()` method is used to access individual characters in a string, and the `length()` method is used to get the length of a string. The `for` loop is used to iterate over the characters in the string, and the `if` statement is used to check if a character appears more than once in the string.</s>
