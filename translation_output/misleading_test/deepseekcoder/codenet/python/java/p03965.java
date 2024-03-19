<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
gpg

Expected output:
-92

```
s=input()
print(len(s)//2-s.count('p'))
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = (int) s.chars().filter(ch -> ch == 'p').count();
        System.out.println(s.length() / 2 - count);
    }
}
```

This Java code reads a string from the standard input, counts the number of 'p' characters in the string, and then prints the result of dividing the length of the string by 2 minus the count of 'p' characters.

You can test this code with the following Java command:

```java Main < input.txt```

Where `input.txt` contains the string "gpg".
<|EOT|>
