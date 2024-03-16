<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        Arrays.fill(A, scanner.nextInt());
        Arrays.fill(B, scanner.nextInt());
        Arrays.fill(C, scanner.nextInt());

        Arrays.sort(A);
        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = A[2] - A[i];
            s += tmp / 2;
            A[i] += tmp / 2 * 2;
        }

        s += Arrays.stream(A).sum() % 3;

        System.out.println(s);
    }
}
```</s>
