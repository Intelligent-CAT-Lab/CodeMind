<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
((*)())

Expected output:
2


```
S=list(input())
N=S.index('*')
P=abs(S[0:N].count('(')-S[0:N].count(')'))
Q=abs(S[N+1:len(S)].count('(')-S[N+1:len(S)].count(')'))
print(min(P,Q))

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.indexOf('*');
        int P = Math.abs(countOccurrences(S.substring(0, N), '(') - countOccurrences(S.substring(0, N), ')'));
        int Q = Math.abs(countOccurrences(S.substring(N + 1), '(') - countOccurrences(S.substring(N + 1), ')'));
        System.out.println(Math.min(P, Q));
    }

    private static int countOccurrences(String s, char c) {
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

This Java code does the same thing as the Python code. It reads a string from the input, finds the index of the '*', calculates the absolute difference between the number of '(' and ')' in the two parts of the string before and after the '*', and then prints the minimum of these two differences. The `countOccurrences` method is used to count the number of occurrences of a specific character in a string.
<|EOT|>
