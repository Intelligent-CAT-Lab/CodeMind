<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
bH

```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String C = scanner.nextLine();
        char[] al = new char[26];
        for (int idx = 0; idx < 26; idx++) {
            al[idx] = (char) (idx + 97);
        }
        int index = new String(al).indexOf(C);
        System.out.println(al[index + 1]);
    }
}
```

This Java code does the same thing as the Python code. It reads a character from the user, creates an array of characters representing the alphabet, finds the index of the input character in the array, and then prints the character that follows it in the alphabet.<｜end▁of▁sentence｜>
