<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
cnt1 = 0
cnt2 = 0
for i in range ( len ( s ) ) :
    if i % 2 == 0 :
        if s [ i ] == '0' :
            cnt1 += 1
        else :
            cnt2 += 1
    else :
        if s [ i ] == '0' :
            cnt2 += 1
        else :
            cnt1 += 1
print ( min ( cnt1 , cnt2 ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    cnt2++;
                } else {
                    cnt1++;
                }
            }
        }
        System.out.println(Math.min(cnt1, cnt2));
    }
}
```
<|EOT|>
