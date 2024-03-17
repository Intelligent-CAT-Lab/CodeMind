<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abaccaba

Expected output:
Yes


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
Here is the Java version of the provided Python code:

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
                scanner.close();
                return;
            }
        }
        System.out.println("Yes");
        scanner.close();
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

This Java code does the same thing as the Python code. It reads a string from the input, and for each character in the alphabet, it checks if the count of that character in the string is odd. If it is, it prints "No" and exits. If it goes through all the characters without finding an odd count, it prints "Yes".
<|EOT|>
