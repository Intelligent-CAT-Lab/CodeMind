<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n=input()
for i in range(n-2/n):print-(n<3)or" ".join(`(i-~(j^(n%2<(j+2<n>i*2))))%n+1`for j in range(n-1))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n - 2; i++) {
            System.out.print((n < 3) ? " " : "(" + (i - (~(Math.pow(i, n % 2) < (i + 2) % n * 2))) % n + 1 + ")");
        }
    }
}
```</s>
