<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
w = 0
for i in range(10 ** 5):
    if i * (i + 1) // 2 < N <= (i + 1) * (i + 2) // 2:
        w = i + 1
        break
for i in range(w, 0, -1):
    if N >= i:
        print(i)
        N -= i
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 0;
        for (int i = 1; i <= 10000000; i++) {
            if (i * (i + 1) / 2 < N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i >= 1; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```</s>
