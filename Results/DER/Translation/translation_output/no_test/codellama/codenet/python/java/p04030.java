<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()
a = ""
for i in s:
  if i == "B":
    if not(a == ""):
      a = a[:-1]
  else:
    a += i
print(a)

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
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                if (!a.isEmpty()) {
                    a = a.substring(0, a.length() - 1);
                }
            } else {
                a += s.charAt(i);
            }
        }
        System.out.println(a);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then it iterates over the characters in the input string using a `for` loop. For each character, it checks if it is a 'B' or not. If it is a 'B', it removes the last character from the `a` string. If it is not a 'B', it adds the character to the `a` string. Finally, it prints the resulting string.</s>
