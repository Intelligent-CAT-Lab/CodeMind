<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xabxa

Expected output:
-65

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
Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code. It reads a string from the input, then checks if the characters at the beginning and end of the string are the same. If they are, it moves the indices towards the center of the string. If they are not, it checks if either index is at an 'x'. If it is, it increments the index and the counter. If neither index is at an 'x', it prints '-1' and exits. Finally, it prints the counter.
<|EOT|>
