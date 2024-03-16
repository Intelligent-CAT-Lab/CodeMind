<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n, k = map(int, input().split())
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print(ans%(10**9+7))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            ans += (((2L * n - i + 1) * i) / 2) - ((i * (i - 1)) / 2) + 1;
        }
        System.out.println(ans % (long) Math.pow(10, 9) + 7);
    }
}
```

Please note that in Java, the `//` operator performs integer division, so we need to use `/` for floating point division and `L` for long integers. Also, the `%` operator in Java is used for modulus operation, not remainder.<｜end▁of▁sentence｜>
