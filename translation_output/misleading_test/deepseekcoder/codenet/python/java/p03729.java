<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
rng gorilla apple

Expected output:
YS

```
a, b, c = input().split()

if a[-1] == b[0] and b[-1] == c[0]:
    print('YES')
else:
    print('NO')


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        if (words[0].charAt(words[0].length() - 1) == words[1].charAt(0) && words[1].charAt(words[1].length() - 1) == words[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code reads a line of input, splits it into words, and checks if the last character of the first word is the same as the first character of the second word, and the last character of the second word is the same as the first character of the third word. It then prints 'YES' if these conditions are met, and 'NO' otherwise.
<|EOT|>
