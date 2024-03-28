<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        String a = scanner.nextLine();

        if (a.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (48 <= c && c <= 57) {
                    m += 1;
                }
                if (97 <= c && c <= 122) {
                    n += 1;
                }
                if (65 <= c && c <= 90) {
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

This Java code does the same thing as the Python code. It reads a string from the user, checks if its length is less than 6, and if so, prints "INVALID". If the string is long enough, it then checks if it contains at least one digit (48-57 in ASCII), one lowercase letter (97-122), and one uppercase letter (65-90). If any of these are missing, it prints "INVALID". Otherwise, it prints "VALID".
<|EOT|>
