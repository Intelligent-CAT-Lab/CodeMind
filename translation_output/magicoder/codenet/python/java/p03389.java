<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C = list(map(int, input().split()))

a = sorted([A, B, C])
s = 0

for i in range(0, 2):
    tmp = a[2] - a[i]
    
    s += tmp // 2
    a[i] += tmp // 2 * 2

s += sum(a) % 3

print(s)
```

@@ Response
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            s += tmp / 2;
            a[i] += (tmp / 2) * 2;
        }
        s += a[0] % 3 + a[1] % 3 + a[2] % 3;
        System.out.println(s);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, sorts them in ascending order, and then performs the same operations as the Python code. The result is printed out.<｜end▁of▁sentence｜>
