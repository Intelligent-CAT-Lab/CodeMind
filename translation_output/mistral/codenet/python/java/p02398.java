<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
ans=0
for i in range(a,b+1):
    if c%i==0:
        ans+=1
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```</s>
