<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
Yes


```
n = input()
tmp = 0
for i in range(len(n)):
  tmp = (tmp + int(n[i])) % 9

print("Yes") if tmp == 0 else print("No")
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Character.getNumericValue(n.charAt(i))) % 9;
        }
        System.out.println(tmp == 0 ? "Yes" : "No");
    }
}
```

This Java code does the same thing as the Python code. It reads a number as a string from the user, then iterates over each digit in the number, adding it to a running total (`tmp`) and taking the modulo 9 of the total. If the final total is 0, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
