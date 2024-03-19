<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
uncopyrightable

Expected output:
yes

```
s=input()
count=0
for member in s:
    count=0
    for member2 in s:
        if member2==member:
            count+=1
    if count>=2:
        print("no")
        break
if count==1:
    print("yes")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (char member : s.toCharArray()) {
            count = 0;
            for (char member2 : s.toCharArray()) {
                if (member2 == member) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then iterates over each character in the string. For each character, it counts how many times it appears in the string. If a character appears more than once, it prints "no" and breaks the loop. If a character appears exactly once, it prints "yes".<｜end▁of▁sentence｜>
