<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
needed

Expected output:
2 5


```
S = input()

if len(S) == 2:
    if S[0] == S[1]:
        print(1, 2)
    else:
        print(-1, -1)
    exit()

for i in range(len(S)-3):
    s = list(S[i:i+3])
    if len(set(s)) <= 2:
        print(i+1, i+3)
        break
else:
    print(-1, -1)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }

        for (int i = 0; i < S.length() - 3; i++) {
            String s = S.substring(i, i + 3);
            if (s.length() <= 2) {
                System.out.println(i + 1 + " " + (i + 3));
                break;
            }
        }

        System.out.println("-1 -1");
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses a `for` loop to iterate over the characters in the input string. If the length of the input string is 2, it checks if the first two characters are the same, and if so, it prints "1 2" and exits. Otherwise, it prints "-1 -1".

If the length of the input string is greater than 2, it uses a `for` loop to iterate over the characters in the input string, and checks if the substring of length 3 starting at each character is a palindrome. If it finds a palindrome, it prints the indices of the first and last characters of the palindrome, and breaks out of the loop. If it reaches the end of the loop without finding a palindrome, it prints "-1 -1".</s>
