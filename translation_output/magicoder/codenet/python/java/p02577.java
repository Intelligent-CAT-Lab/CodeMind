<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
        if (tmp == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, calculates the sum of its digits modulo 9, and then prints "Yes" if the result is 0, otherwise it prints "No".<｜end▁of▁sentence｜>
