<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder

Expected output:
ACO

```
S = input()

flag = 0
if S[0] != "A":
    flag = 1
    
count = 0
for i in range(2,len(S)-1):
    if S[i] == "C":
        count += 1
if count != 1:
    flag = 1

count2 = 0
for i in S:
    if i == i.upper():
        count2 += 1
if count2 != 2:
    flag = 1
    
if flag == 0:
    print("AC")
else:
    print("WA")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        if (input.charAt(0) != 'A') {
            System.out.println("WA");
            return;
        }

        int count = 0;
        for (int i = 2; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'C') {
                count++;
            }
        }
        if (count != 1) {
            System.out.println("WA");
            return;
        }

        int count2 = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                count2++;
            }
        }
        if (count2 != 2) {
            System.out.println("WA");
            return;
        }

        System.out.println("AC");
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then checks if the first character is 'A', if not it prints "WA" and returns.

It then checks if the string contains exactly one 'C' character, if not it prints "WA" and returns.

It then checks if the string contains exactly two uppercase characters, if not it prints "WA" and returns.

If all the conditions are met, it prints "AC".</s>
