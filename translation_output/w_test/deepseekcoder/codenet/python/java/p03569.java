<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xabxa

Expected output:
2


```
import sys
S = str(input())
i = 0
j = len(S) - 1
c = 0
while(True):
    if i >= j:
        break
    if (S[i] == S[j]):
        i += 1
        j -= 1
    else:
        if (S[i] == 'x'):
            i += 1
            c += 1
        elif (S[j] == 'x'):
            j -= 1
            c += 1
        else:
            print('-1')
            sys.exit()
print(c)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int i = 0;
        int j = S.length() - 1;
        int c = 0;
        while(true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i += 1;
                j -= 1;
            } else {
                if (S.charAt(i) == 'x') {
                    i += 1;
                    c += 1;
                } else if (S.charAt(j) == 'x') {
                    j -= 1;
                    c += 1;
                } else {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then uses two pointers (i and j) to compare characters from the start and end of the string. If the characters are equal, it moves the pointers inwards. If they are not equal, it checks if the character at the start or end is 'x'. If it is, it increments the count and moves the corresponding pointer inwards. If neither character is 'x', it prints '-1' and exits. Finally, it prints the count.
<|EOT|>
