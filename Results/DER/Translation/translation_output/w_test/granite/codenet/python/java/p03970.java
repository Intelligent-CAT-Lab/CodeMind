System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
C0DEFESTIVAL2O16

Expected output:
2


```
S = str(input())
A = 'CODEFESTIVAL2016'
cnt = 0
for i in range(len(A)):
    if A[i]!= S[i]:
        cnt += 1
print(cnt)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String A = "CODEFESTIVAL2016";
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i)!= S.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```

Test input:
C0DEFESTIVAL2O16

Expected output:
2<|endoftext|>
