Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0


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
print ( min ( cnt1, cnt2 ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt1 = 0, cnt2 = 0;
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
```<|endoftext|>
