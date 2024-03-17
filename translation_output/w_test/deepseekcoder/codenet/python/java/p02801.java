<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
b


```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        char[] al = new char[26];
        for (int i = 0; i < 26; i++) {
            al[i] = (char) ('a' + i);
        }
        int idx = c - 'a';
        System.out.println((char) (al[idx + 1]));
    }
}
```

This Java code does the same thing as the Python code. It reads a character from the input, creates an array of characters representing the alphabet, finds the index of the input character in the array, and then prints the character that follows it in the array.
<|EOT|>
