<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
;@G

```
n = int(input())
list_N = list(str(n))
num = 0

for i in list_N:
    num += int(i)
ans = "No"

if n%num == 0:
    ans = "Yes"

print(ans)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String listN = String.valueOf(n);
        int num = 0;

        for (int i = 0; i < listN.length(); i++) {
            num += Character.getNumericValue(listN.charAt(i));
        }
        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, converts it to a string, and then iterates over each character in the string, adding its numeric value to a running total. It then checks if the original number is divisible by this total, and if so, sets the answer to "Yes". Otherwise, it sets the answer to "No". Finally, it prints the answer.<｜end▁of▁sentence｜>
