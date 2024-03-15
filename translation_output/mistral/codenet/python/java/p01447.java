<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

ans = 0
tmp = 1
while n > tmp:
    tmp *= 3
    ans+=1
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans++;
        }
        System.out.println(ans);
    }
}
```</s>
