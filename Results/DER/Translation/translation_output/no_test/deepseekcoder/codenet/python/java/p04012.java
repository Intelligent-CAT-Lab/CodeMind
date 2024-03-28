<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        for (char c : alphabet.toCharArray()) {
            if (countOccurrences(w, c) % 2 == 1) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }

    private static int countOccurrences(String str, char c) {
        int count = 0;
        for (char temp : str.toCharArray()) {
            if (temp == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as your Python code. It checks if each character in the alphabet occurs an even number of times in the input string `w`. If any character occurs an odd number of times, it prints "No" and exits. If all characters occur an even number of times, it prints "Yes".
<|EOT|>
