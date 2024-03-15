<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
#ABC056-C
x = int(input())

#2æ¬¡æ¹ç¨å¼ãè§£ã
t = int((-1+(1+8*x)**0.5)//2)

if t * (t+1) // 2 >= x:
    print(t)
else:
    print(t+1)
```
[/INST]
```java
import java.util.Scanner;

public class ABC056_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 2æ¬¡æ¹ç¨å¼ãè§£ã
        int t = (int) Math.ceil((-1 + (1 + 8 * x)) / 2.0);

        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}
```</s>
