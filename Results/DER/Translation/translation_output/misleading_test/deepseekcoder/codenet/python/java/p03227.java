<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba

```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            StringBuilder sb = new StringBuilder(l);
            System.out.println(sb.reverse().toString());
        }
    }
}
```

This Java code reads a line of input from the user, checks if the length of the input string is 2, and if so, prints the string. If the length is not 2, it creates a StringBuilder object with the input string, reverses it, and then prints the reversed string.
<|EOT|>
