<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
bac

Expected output:
~B{

```
S=input()
if 'a' in S and 'b' in S and 'c' in S:
    print('Yes')
else:
    print('No')
```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        if (S.contains("a") && S.contains("b") && S.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads a string from the user, checks if it contains all the characters 'a', 'b', and 'c', and prints 'Yes' if it does, 'No' otherwise.
<|EOT|>
