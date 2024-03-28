<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
AWBC

```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        System.out.println(s1.toUpperCase().charAt(0) + "" + s2.toUpperCase().charAt(0) + "" + s3.toUpperCase().charAt(0));
    }
}
```

This Java code reads three strings from the input, converts them to uppercase, and then prints the first character of each string. The `charAt(0)` method is used to get the first character of a string, and the `toUpperCase()` method is used to convert a string to uppercase. The `+ ""` is used to convert the char to a string so that they can be concatenated.
<|EOT|>
