<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KUPCkupcKUPC

Expected output:
2


```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```

### Response:
Here is the Java code equivalent to the Python code you provided:

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

This Java code reads a string from the input, counts the occurrences of 'K', 'U', 'P', and 'C' in the string, and then prints the minimum of these counts. The `countChar` method is used to count the occurrences of a specific character in a string.
<|EOT|>
