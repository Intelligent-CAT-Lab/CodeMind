<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KUPCkupcKUPC

Expected output:
-30

```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int K = countChar(input, 'K');
        int U = countChar(input, 'U');
        int P = countChar(input, 'P');
        int C = countChar(input, 'C');
        System.out.println(Math.min(K, Math.min(U, Math.min(P, C))));
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code reads a line of input from the user, counts the number of 'K', 'U', 'P', and 'C' characters in the input string, and then prints the minimum count. The `countChar` method is used to count the occurrences of a specific character in the string.<｜end▁of▁sentence｜>
