<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int K = countChar(input, 'K');
        int U = countChar(input, 'U');
        int P = countChar(input, 'P');
        int C = countChar(input, 'C');
        System.out.println(Math.min(Math.min(Math.min(K, U), P), C));
    }

    private static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of 'K', 'U', 'P', and 'C' characters in the string, and then prints the minimum of these counts. The `countChar` method is a helper method that counts the number of occurrences of a specific character in a string.
<|EOT|>
