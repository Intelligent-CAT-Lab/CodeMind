<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int flag = 0;
        if (S.charAt(0) != 'A') {
            flag = 1;
        }

        int count = 0;
        for (int i = 1; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') {
                count++;
            }
        }
        if (count != 1) {
            flag = 1;
        }

        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == Character.toUpperCase(S.charAt(i))) {
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
```</s>
