<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int uppercase = 0;
        int lowercase = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else {
                lowercase++;
            }
        }
        
        if (uppercase > lowercase) {
            System.out.println(word.toUpperCase());
        } else if (lowercase > uppercase) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

word = sys.stdin.readline().strip()
uppercase = 0
lowercase = 0

for ch in word:
    if ch.isupper():
        uppercase += 1
    else:
        lowercase += 1

if uppercase > lowercase:
    print(word.upper())
elif lowercase > uppercase:
    print(word.lower())
else:
    print(word.lower())
```
Note: The `sys.stdin.readline()` method is used to read a line from the standard input, and the `strip()` method is used to remove any trailing whitespace from the line. The `for` loop iterates over the characters in the word, and the `if` statement checks if each character is uppercase or lowercase. If the number of uppercase characters is greater than the number of lowercase characters, the word is printed in uppercase. If the number of lowercase characters is greater than the number of uppercase characters, the word is printed in lowercase. If the number of uppercase and lowercase characters is equal, the word is printed in lowercase.</s>
