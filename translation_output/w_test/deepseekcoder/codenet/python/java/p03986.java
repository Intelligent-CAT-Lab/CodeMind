<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
TSTTSS

Expected output:
4


```
X=input()
ans=0
memo=0
for i in range(len(X)):
    if X[i]=="T":
        if memo==0:pass
        else:memo-=1
    else:memo+=1
print(memo*2)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.next();
        int ans = 0;
        int memo = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                    // do nothing
                } else {
                    memo -= 1;
                }
            } else {
                memo += 1;
            }
        }
        System.out.println(memo * 2);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then iterates over each character in the string. If the character is 'T', it decreases the `memo` variable by 1 unless `memo` is already 0. If the character is not 'T', it increases the `memo` variable by 1. Finally, it prints the value of `memo` multiplied by 2.
<|EOT|>
