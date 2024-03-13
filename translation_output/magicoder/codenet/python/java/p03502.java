<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
list_N = list(str(n))
num = 0

for i in list_N:
    num += int(i)
ans = "No"

if n%num == 0:
    ans = "Yes"

print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String strN = String.valueOf(n);
        int num = 0;

        for (int i = 0; i < strN.length(); i++) {
            num += Integer.parseInt(String.valueOf(strN.charAt(i)));
        }
        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```<｜end▁of▁sentence｜>
