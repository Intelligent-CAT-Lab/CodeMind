<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
x=int(input())

ans=0
q,r=divmod(x,11)
ans+=2*q
q,r=divmod(r,6)
ans+=q
if r>0:
  ans+=1
print(ans)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        int q = x / 11;
        int r = x % 11;
        ans += 2 * q;
        q = r / 6;
        ans += q;
        if (r % 6 > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
```<｜end▁of▁sentence｜>
