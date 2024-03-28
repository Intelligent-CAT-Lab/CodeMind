<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
-15

```
n,k=map(int,input().split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }
        System.out.println(a);
    }
}
```</s>
