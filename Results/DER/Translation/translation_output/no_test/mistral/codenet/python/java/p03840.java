<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
I, O, T, J, L, S, Z = map(int, input().split())
if I and J and L:
  a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O
else:
  a = 0
b = (I//2 + J//2 + L//2)*2 + O
ans = max(a, b)
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int O = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int T = scanner.nextInt();
        int Z = scanner.nextInt();

        if (I != 0 && J != 0 && L != 0) {
            int a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
            int b = ((I / 2 + J / 2 + L / 2) * 2 + O);
            int ans = Math.max(a, b);
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
```</s>
