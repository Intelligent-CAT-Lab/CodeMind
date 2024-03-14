<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }

        for (int i = 0; i < S.length() - 3; i++) {
            String s = S.substring(i, i + 3);
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            if (set.size() <= 2) {
                System.out.println((i + 1) + " " + (i + 3));
                break;
            }
        }

        System.out.println("-1 -1");
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, checks if the length of the string is 2, and if the first and second characters are the same. If so, it prints "1 2". If not, it prints "-1 -1". Then it checks each substring of length 3 in the string for a substring where the number of unique characters is less than or equal to 2. If such a substring is found, it prints the start and end indices of the substring. If no such substring is found, it prints "-1 -1".
<|EOT|>
