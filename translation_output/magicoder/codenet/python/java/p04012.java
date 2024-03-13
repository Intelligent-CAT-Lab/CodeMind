<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code. It checks if all the letters in the string `Alfa` appear an even number of times in the input string `w`. If any letter appears an odd number of times, it prints "No" and exits. If all letters appear an even number of times, it prints "Yes".<｜end▁of▁sentence｜>
