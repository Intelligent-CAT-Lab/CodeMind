<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder

Expected output:
AC


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
        int flag = 0;
        if (input.charAt(0) != 'A') {
            flag = 1;
        }
        int count = 0;
        for (int i = 2; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'C') {
                count++;
            }
        }
        if (count != 1) {
            flag = 1;
        }
        int count2 = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                count2++;
            }
        }
        if (count2 != 2) {
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user, and the `Character` class to check if a character is uppercase or not.</s>
