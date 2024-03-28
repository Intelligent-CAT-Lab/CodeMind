<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
2


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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] a = new int[]{A, B, C};
        Arrays.sort(a);

        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            s += tmp / 2;
            a[i] += tmp / 2 * 2;
        }

        s += sum(a) % 3;

        System.out.println(s);
    }

    public static int sum(int[] a) {
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }
}
```
<|endoftext|>
