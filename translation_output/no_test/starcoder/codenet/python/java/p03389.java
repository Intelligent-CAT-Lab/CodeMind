<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);

        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = arr[2] - arr[i];
            s += tmp / 2;
            arr[i] += tmp / 2 * 2;
        }

        s += Arrays.stream(arr).sum() % 3;

        System.out.println(s);
    }
}
```
<|endoftext|>
