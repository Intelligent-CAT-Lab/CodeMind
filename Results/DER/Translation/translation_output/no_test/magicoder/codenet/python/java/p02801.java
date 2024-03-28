<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String C = scanner.next();
        char[] al = new char[26];
        for (int idx = 0; idx < 26; idx++) {
            al[idx] = (char) (idx + 97);
        }
        int index = new String(al).indexOf(C);
        if (index != -1 && index < 25) {
            System.out.println(al[index + 1]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a character from the user, creates an array of lowercase alphabets, finds the index of the input character in the array, and then prints the next character in the array. If the input character is not found or is the last character in the array, it does not print anything.<｜end▁of▁sentence｜>
