<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println(1 + " " + 2);
            } else {
                System.out.println(-1 + " " + -1);
            }
            System.exit(0);
        }

        for (int i = 0; i < S.length() - 3; i++) {
            String s = S.substring(i, i + 3);
            if (s.length() <= 2) {
                System.out.println(i + 1 + " " + (i + 3));
                break;
            }
        }

        System.out.println(-1 + " " + -1);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `String` class is used to manipulate strings. The `System.exit(0)` method is used to exit the program with a status code of 0.</s>
