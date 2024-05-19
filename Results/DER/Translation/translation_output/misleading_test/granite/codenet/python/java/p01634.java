System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
password

Expected output:
INV*ALID

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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.length() < 6) {
            System.out.println("INVALID");
        } else {
            int lowerCaseCount = 0;
            int upperCaseCount = 0;
            int digitCount = 0;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isLowerCase(c)) {
                    lowerCaseCount++;
                } else if (Character.isUpperCase(c)) {
                    upperCaseCount++;
                } else if (Character.isDigit(c)) {
                    digitCount++;
                }
            }

            if (lowerCaseCount == 0 || upperCaseCount == 0 || digitCount == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
    }
}
```

Test input:
password

Expected output:
INVALID<|endoftext|>
