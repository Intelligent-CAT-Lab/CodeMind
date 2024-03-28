<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
S = str(input())
A = 'CODEFESTIVAL2016'
cnt = 0
for i in range(len(A)):
    if A[i] != S[i]:
        cnt += 1
print(cnt)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String A = "CODEFESTIVAL2016";
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != S.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```
<|EOT|>
