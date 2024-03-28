Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder

Expected output:
ACO

```
S = input()

flag = 0
if S[0]!= "A":
    flag = 1
    
count = 0
for i in range(2,len(S)-1):
    if S[i] == "C":
        count += 1
if count!= 1:
    flag = 1

count2 = 0
for i in S:
    if i == i.upper():
        count2 += 1
if count2!= 2:
    flag = 1
    
if flag == 0:
    print("AC")
else:
    print("WA")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int flag = 0;
        if (S.charAt(0)!= 'A') {
            flag = 1;
        }

        int count = 0;
        for (int i = 2; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') {
                count++;
            }
        }
        if (count!= 1) {
            flag = 1;
        }

        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i) + 32) {
                count2++;
            }
        }
        if (count2!= 2) {
            flag = 1;
        }

        if (flag == 0) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}
```<|endoftext|>
