<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
password

Expected output:
INVALID


```
a = input()

if len(a) < 6:
    print("INVALID")
else:
    m = 0
    n = 0
    l = 0
    for i in range(len(a)):
        if 48 <= ord(a[i]) <= 57:
            m += 1
        if 97 <= ord(a[i]) <= 122:
            n += 1
        if 65 <= ord(a[i]) <= 90:
            l += 1
    if m == 0 or n == 0 or l == 0:
        print("INVALID")
    else:
        print("VALID")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();

        if (password.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isDigit(ch)) {
                    m += 1;
                }
                if (Character.isLowerCase(ch)) {
                    n += 1;
                }
                if (Character.isUpperCase(ch)) {
                    l += 1;
                }
            }
            if (m == 0 || n == 0 || l == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, checks if its length is less than 6, and if so, prints "INVALID". If the string is long enough, it then checks if it contains at least one digit, one lowercase letter, and one uppercase letter. If any of these are missing, it prints "INVALID". If all are present, it prints "VALID".
<|EOT|>
