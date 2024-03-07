<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()
a_index = 0
z_index = 0
for i in range(len(s)):
    if s[i] == 'A':
        a_index = i
        break
for i in range(len(s) - 1, 0, -1):
    if s[i] == 'Z':
        z_index = i
        break
print(z_index - a_index + 1)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int aIndex = 0;
        int zIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aIndex = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                zIndex = i;
                break;
            }
        }
        System.out.println(zIndex - aIndex + 1);
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and the `String` class to represent strings. We also use the `charAt()` method to access individual characters in a string.</s>
