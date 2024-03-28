<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
needed

Expected output:
2

```
S = input()

if len(S) == 2:
    if S[0] == S[1]:
        print(1, 2)
    else:
        print(-1, -1)
    exit()

for i in range(len(S)-3):
    s = list(S[i:i+3])
    if len(set(s)) <= 2:
        print(i+1, i+3)
        break
else:
    print(-1, -1)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println(1 + " " + 2);
            } else {
                System.out.println(-1 + " " + -1);
            }
            return;
        }

        for (int i = 0; i < S.length() - 2; i++) {
            String s = S.substring(i, i + 3);
            if (new HashSet<>(s.split("")).size() <= 2) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }
        System.out.println(-1 + " " + -1);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, checks if the length of the string is 2, and if so, checks if the two characters are the same. If they are, it prints "1 2", otherwise it prints "-1 -1". If the length of the string is not 2, it then checks each substring of length 3 in the string to see if there are at most 2 unique characters. If it finds such a substring, it prints the start and end indices of the substring (1-indexed), otherwise it prints "-1 -1".<｜end▁of▁sentence｜>
