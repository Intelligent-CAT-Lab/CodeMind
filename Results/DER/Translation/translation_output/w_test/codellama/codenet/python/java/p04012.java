<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            if (input.indexOf(c) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. It then iterates through the alphabet and checks if the input string contains any characters that appear an odd number of times. If it does, it prints "No" and exits the program. If it doesn't, it prints "Yes".</s>
