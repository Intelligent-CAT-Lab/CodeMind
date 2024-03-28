<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.length() < 6) {
            System.out.println("INVALID");
        } else {
            int numCount = 0;
            int lowerCount = 0;
            int upperCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c >= '0' && c <= '9') {
                    numCount++;
                } else if (c >= 'a' && c <= 'z') {
                    lowerCount++;
                } else if (c >= 'A' && c <= 'Z') {
                    upperCount++;
                }
            }
            if (numCount == 0 || lowerCount == 0 || upperCount == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
    }
}
```
Note: The `ord()` function in Python is not available in Java, so I have used the `charAt()` method to get the character at a specific index in the string.</s>
