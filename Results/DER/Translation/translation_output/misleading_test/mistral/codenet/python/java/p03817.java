<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
83

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        int q = x / 11;
        int r = x % 11;
        ans += 2 * q;
        q = r / 6;
        ans += q;
        if (r > 0) {
            ans++;
        }
        System.out.println(ans);
    }
}
```</s>
