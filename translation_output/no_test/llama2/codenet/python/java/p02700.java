<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,C,D = map(int,input().split())
while A>0 and C>0:
    C -= B
    if C<=0:
        print("Yes")
        break
    A -= D
    if A<=0:
        print("No")
        break
```

### Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}
```
</s>
