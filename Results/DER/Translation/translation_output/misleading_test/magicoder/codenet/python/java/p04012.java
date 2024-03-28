<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abaccaba

Expected output:
Ye

```
# coding = SJIS
Alfa = "abcdefghijklmnopqrstuvwxyz"
w = str(input())
for i in Alfa:
    if w.count(i) % 2 == 1:
        print("No")
        exit()
print("Yes")
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        for (char c : alfa.toCharArray()) {
            if (countChar(w, c) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private static int countChar(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then checks each character in the alphabet to see if it appears an odd number of times in the input string. If it does, it prints "No" and exits. If it doesn't, it prints "Yes".<｜end▁of▁sentence｜>
